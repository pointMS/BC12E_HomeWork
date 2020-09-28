package hw20200926_Beginner8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMaxTest {
    @Test
    public void zeroMax_No0_BaseArray() {
        int[] a = {2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.zeroMax(a)));
    }

    @Test
    public void zeroMax_EvenNumberAfter0_updatedArray() {
        int[] a = {0, 3, 4, 0};
        int[] expected = {3, 3, 4, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.zeroMax(a)));
    }

    @Test
    public void zeroMax_NoEvenNumbersAfter0_BaseArray() {
        int[] a = {0, 4, 0, 6};
        int[] expected = {0, 4, 0, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task8.zeroMax(a)));
    }
}
