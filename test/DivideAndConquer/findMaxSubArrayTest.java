package DivideAndConquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMaxSubArrayTest {

    @Test
    public void findMaxArray() {
        findMaxSubArray fs = new findMaxSubArray();
        int[] array = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        assertEquals(43, fs.findMaxArray(array, 0, array.length-1));
    }
}