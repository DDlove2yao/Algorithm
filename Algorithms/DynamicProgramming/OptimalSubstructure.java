package DynamicProgramming;

public class OptimalSubstructure {
    /*
    最优子结构问题：
    切割钢条，求得以何种方式可以获得最大利润
    （1）自顶向下递归实现：
    rn = max(pi+rn-i)
     */
    public int cutRod(int[] price, int n){
        //第一段长度为n，收益为p
        if(n == 0)return 0;
        int q = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            q = Math.max(q, price[i]+cutRod(price, n-i));
        }
        return q;
    }
    //(2)带有记录的自顶向下动态规划
    public int memoryCutRod(int[] price, int n){
        int[] memory = new int[n+1];
        for(int i = 0; i < n+1; i++){
            memory[i] = Integer.MIN_VALUE;
        }
        return memoryCutRodAux(price, n, memory);
    }

    public int memoryCutRodAux(int[] price, int n, int[] memory){
        int q = Integer.MIN_VALUE;;
        if(memory[n] >= 0)return memory[n];//检测所需的值是否已知
        if(n == 0)q = 0;
        for(int i = 1; i <= n; i++){
            q = Math.max(q, price[i]+memoryCutRodAux(price, n-i, memory));
        }
        memory[n] = q;
        return q;
    }
    //(3)自底向上法
    /*
    j < i，则规模为i的问题比规模为j的子问题更小
     */
    public int bottomUpCutRod(int[] price, int n){
        int[] memory = new int[n+1];
        memory[0] = 0;
        for(int i = 1; i <= n; i++){
            int q = Integer.MIN_VALUE;
            for(int j = 1; j <= i; j++){
                q = Math.max(q, price[j]+memory[i-j]);
            }
            memory[i] = q;
        }
        return memory[n];
    }
}
