package DivideAndConquer;

public class findMaxSubArray {

    //连续子数组最大值的问题。采用分治策略
    public int findMaxArray(int[] array, int low, int high){
        if(low == high)return array[low]; //only one element
        int mid = (low + high) / 2;
        int left = findMaxArray(array, low, mid);
        int right = findMaxArray(array, mid+1, high);
        int cross = findMaxCrossingSubArray(array, low, mid, high);

        return Math.max(Math.max(left, right), cross);
    }

    public int findMaxCrossingSubArray(int[] array, int low, int mid, int high){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i >= low; i--){
            sum += array[i];
            if(sum> leftSum){
                leftSum = sum;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = mid+1; i <= high; i++){
            sum += array[i];
            if(sum > rightSum){
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }
}
