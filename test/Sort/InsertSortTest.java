package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void sort() {
        int[] array = {5,2,4,6,1,3};
        int[] correct = {1,2,3,4,5,6};
        Sort.InsertSort insertSort = new InsertSort();
        assertArrayEquals(correct, insertSort.sort(array));
    }
}