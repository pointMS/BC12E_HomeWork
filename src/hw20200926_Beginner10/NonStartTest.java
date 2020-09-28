package hw20200926_Beginner10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {
    @Test
    public void nonStart_WithoutFirstSymbol_NewString(){
        String a = "abcde";
        String b = "12345";
        String expected = "bcde2345";
        assertEquals(expected,Task10.nonStart(a,b));
    }
}
