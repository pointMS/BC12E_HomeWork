package hw20200926_Beginner3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {
    @Test
    public void endUp_LengthMoreThan3_Last3ToUpperCase() {
        String str = "abcdefj";
        String expected = "abcdEFJ";
        assertEquals(expected,Task3.endUp(str));
    }

    @Test
    public void endUp_LengthLessThan3_ToUpperCase() {
        String str = "ab";
        String expected = "AB";
        assertEquals(expected,Task3.endUp(str));
    }

    @Test
    public void endUp_LengthEquals3_ToUpperCase() {
        String str = "abc";
        String expected = "ABC";
        assertEquals(expected,Task3.endUp(str));
    }

        @Test
    public void endUp_EmptyString_OriginalString() {
        String str = "";
        String expected = "";
        assertEquals(expected,Task3.endUp(str));
    }
}
