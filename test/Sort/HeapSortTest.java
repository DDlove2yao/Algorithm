package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void heapSort() {
        int[] array = {7,5,3,9,1,6,2,4,8};
        int[] correct = {1,2,3,4,5,6,7,8,9};
        HeapSort hs = new HeapSort();
        hs.heapSort(array);
        assertArrayEquals(correct, array);
    }

    @Test
    void queueSort() {
        int[] array = {7,5,3,9,1,6,2,4,8};
        int[] correct = {1,2,3,4,5,6,7,8,9};
        HeapSort hs = new HeapSort();
        hs.queueSort(array);
        assertArrayEquals(correct, array);
    }
}