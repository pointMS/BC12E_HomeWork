package hw20200926_Beginner5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonEndTest {
    @Test
    public void commonEnd_FirstAreEquals_True() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 5, 9};
        assertTrue(Task5.commonEnd(a, b));
    }

    @Test
    public void commonEnd_LastAreEquals_True() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 5, 3};
        assertTrue(Task5.commonEnd(a, b));
    }

    @Test
    public void commonEnd_FirstAndLastNotEquals_False() {
        int[] a = {6, 7, 2};
        int[] b = {1, 3, 5, 3};
        assertFalse(Task5.commonEnd(a, b));
    }
}
