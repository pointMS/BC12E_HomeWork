package hw20200926_Beginner7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEvensTest {
    @Test
    public void countEvens_NoEvenNumbers_0() {
        int[] a = {1, 3, 7, 9};
        int expected = 0;
        assertEquals(expected, Task7.countEvens(a));
    }

    @Test
    public void countEvens_AllNumbersEven_Count() {
        int[] a = {2, 4, 6, 8, 10};
        int expected = 5;
        assertEquals(expected, Task7.countEvens(a));
    }

    @Test
    public void countEvens_EvenAndOddNumbers_Count() {
        int[] a = {2, 5, 6, 8, 11};
        int expected = 3;
        assertEquals(expected, Task7.countEvens(a));
    }
}