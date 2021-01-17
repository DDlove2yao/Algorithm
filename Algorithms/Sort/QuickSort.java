package Sort;

public class QuickSort {

    public void quickSort(int[] array, int start, int end){
        if(start < end){
            int mid = partition(array, start, end);
            quickSort(array, start, mid-1);
            quickSort(array, mid+1, end);
        }
    }

    public int partition(int[] array, int start, int end){
        int x = array[end];
        int i = start-1;
        for(int j = start; j <= end-1; j++){
            if(array[j] <= x){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;
        return i+1;
    }
}
