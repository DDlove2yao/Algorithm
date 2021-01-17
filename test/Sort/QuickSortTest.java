package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        int[] array = {2,8,7,1,3,5,6,4};
        int[] correct = {1,2,3,4,5,6,7,8};
        QuickSort qs = new QuickSort();
        qs.quickSort(array, 0, array.length-1);
        assertArrayEquals(correct, array);
    }
}