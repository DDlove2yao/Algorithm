package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void counting_sort() {
        int[] array = {2,5,3,0,2,3,0,3};
        int[] correct = {0,0,2,2,3,3,3,5};
        CountingSort cs = new CountingSort();
        assertArrayEquals(correct, cs.counting_sort(array));
    }
}