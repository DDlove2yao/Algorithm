package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        MergeSort mS = new MergeSort();
        int[] array = {2,4,5,7,1,2,3,6};
        int[] correct = {1,2,2,3,4,5,6,7};
        int[] temp = new int[array.length];
        mS.mergeSort(array, 0, array.length-1, temp);
        assertArrayEquals(correct, array);
    }
}