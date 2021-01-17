package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingSort {

    public int[] counting_sort(int[] array){
        int n = array.length;
        int[] temp = new int[n];
        int[] res = new int[n];
        Arrays.fill(temp, 0);
        for(int i = 0; i < n; i++){
            //temp[i] now contains the number of elements equal to i
            temp[array[i]] += 1;
        }
        for(int i = 1; i < n; i++){
            //temp[i] now contains the number of elements less than or equal to i
            temp[i] += temp[i-1];
        }
        for(int j = array.length-1; j >= 0; j--){
            res[temp[array[j]]-1] = array[j];
            temp[array[j]] -= 1;
        }
        return res;
    }
}
