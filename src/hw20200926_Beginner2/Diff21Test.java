package hw20200926_Beginner2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {
    @Test
    public void diff21_nMoreThan21_DoubleResult() {
        int n = 23;
        int expected = (23 - 21) * 2;
        assertEquals(expected, Task2.diff21(n));
    }

    @Test
    public void diff21_nLessThan21_Result() {
        int n = 5;
        int extected = 21 - n;
        assertEquals(extected, Task2.diff21(n));
    }

    @Test
    public void diff21_nEqulas21_Result0() {
        int n = 21;
        int extected = 21 - n;
        assertEquals(extected, Task2.diff21(n));
    }

}