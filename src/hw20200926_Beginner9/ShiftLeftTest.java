package hw20200926_Beginner9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShiftLeftTest {
    @Test
    public void shiftLeft_IndexesMoved_UpdatedArray() {
        int[] a = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(Task9.shiftLeft(a)));
    }

}
