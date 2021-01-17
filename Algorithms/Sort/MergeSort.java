package Sort;

public class MergeSort {
    public void mergeSort(int[] array, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right)/2;
            //向左递归
            mergeSort(array, left, mid, temp);
            //向右递归
            mergeSort(array, mid+1, right, temp);
            //合并
            merge(array, left, mid, right, temp);
        }
    }

    public void merge(int[] array, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while(i <= mid && j <= right){
            if(array[i] < array[j]){
                temp[t] = array[i];
                t++;
                i++;
            }else{
                temp[t] = array[j];
                t++;
                j++;
            }
        }
        //剩下的数据全部填充到temp
        while(i <= mid){
            temp[t] = array[i];
            t++;
            i++;
        }
        while(j <= right){
            temp[t] = array[j];
            t++;
            j++;
        }
        t = 0;
        int flag = left;
        while(flag <= right){
            array[flag] = temp[t];
            t++;
            flag++;
        }
    }
}
