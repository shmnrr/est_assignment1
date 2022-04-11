package zest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        // CONSTRAINTS: 1 <= a.length <= 10^3 and -10^4 <= a[i] <= 10^4
        // should throw errors but not implemented

        //1 <= a.length <= 10^3

        //assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(new int[(int) (Math.pow(10, 3) + 1)]));
        //assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(new int[0]));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> maximumSubarray.maxSubArray(new int[0]));

        //-10^4 <= a[i] <= 10^4
        //assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(new int[] {(int) (Math.pow(10, 4) + 1)}));
        //assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(new int[] ((int) -Math.pow(10, 4) - 1)}));

        // CHECK FOR empty array, null array, 1 element, >=2 elements,
        // The implementation should not allow empty arrays
        // assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(new int[]{}));
        // ALSO should handle null in some way
        assertThrows(NullPointerException.class, () -> maximumSubarray.maxSubArray(null));

        assertEquals(1, maximumSubarray.maxSubArray(new int[]{1})); // one element array
        assertEquals(3, maximumSubarray.maxSubArray(new int[]{1,2})); // two element array

        // CHECK IF CORRECTLY HANDLES ONLY NEGATIVE ARRAY : should simply return the highest number
        assertEquals(-9, maximumSubarray.maxSubArray(new int[]{-9,-999,-99}));

        // DOES IT HANDLE ZERO CORRECTLY?
        assertEquals(3, maximumSubarray.maxSubArray(new int[]{1, 0, 2}));
    }
}