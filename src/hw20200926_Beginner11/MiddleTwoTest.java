package hw20200926_Beginner11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {
    @Test
    public void middleTwo_StrLengthEven_NewStr(){
        String a = "qwerty";
        String expected = "er";
        assertEquals(expected, Task11.middleTwo(a));
    }

    @Test
    public void middleTwo_StrLengthOdd_Str(){
        String a = "qwert";
        String expected = "qwert";
        assertEquals(expected, Task11.middleTwo(a));
    }
}
