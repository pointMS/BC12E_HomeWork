package hw20200926_Beginner4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {
    @Test
    public void intMax_FirstIsMax_First() {
        int a = 3, b = 2, c = 1;
        int expected = 3;
        assertEquals(expected, Task4.intMax(a, b, c));
    }

    @Test
    public void intMax_SecondIsMax_First() {
        int a = 3, b = 6, c = 1;
        int expected = 6;
        assertEquals(expected, Task4.intMax(a, b, c));
    }

    @Test
    public void intMax_ThirdIsMax_First() {
        int a = 3, b = 6, c = 11;
        int expected = 11;
        assertEquals(expected, Task4.intMax(a, b, c));
    }

}