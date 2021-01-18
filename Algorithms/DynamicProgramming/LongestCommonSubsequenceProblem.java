package DynamicProgramming;

public class LongestCommonSubsequenceProblem {
    /*
    LCS最优子结构转移方程：
    c[i,j] = 0                      i =0 || j = 0
    c[i,j] = c[i-1, j-1]+1          i,j>0 && xi = yj
    c[i,j] = max(c[i,j-1],c[i-1,j]) i,j>0 && xi != yj
     */
    //使用动态规划自底向上的方式
    public int[][] lcsLength(String[] x, String[] y){
        int m = x.length, n = y.length;
        //b帮助构造最优解
        String[][] b = new String[m][n];
        //c保存了x和y的LCS长度
        int[][] c = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            c[i][0] = 0;
        }
        for(int j = 0; j <= n; j++){
            c[0][j] = 0;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m; j++){
                if(x[i].equals(y[j])){
                    c[i][j] = c[i-1][j-1]+1;
                    b[i][j] = "↖";
                }else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = "↑";
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = "←";
                }
            }
        }
        return c;
    }
}
