package hw20200926_Beginner6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum2Test {
    @Test
    public void sum2_ArrayLengthMoreThan2_SumFirstTwo() {
        int[] a = {2, 3, 4};
        int expected = 2 + 3;
        assertEquals(expected, Task6.sum2(a));
    }

    @Test
    public void sum2_ArrayLengthEquals2OrLessThan2_Sum() {
        int[] a = {3, 4};
        int expectedA = 3 + 4;
        int[] b = {4};
        int expectedB = 4;
        assertEquals(expectedA, Task6.sum2(a));
        assertEquals(expectedB, Task6.sum2(b));
    }

    @Test
    public void sum2_ArrayLengthEquals0_0() {
        int[] a = {};
        assertEquals(0, Task6.sum2(a));
    }
}
