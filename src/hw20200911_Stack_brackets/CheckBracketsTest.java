package hw20200911_Stack_brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBracketsTest {
    @Test
    public void brackets_StringCorrect_true() {
        CheckBrackets checkBrackets = new CheckBrackets();
        assertTrue(checkBrackets.checkIfBracketsCorrect("(...)"));
    }

    @Test
    public void brackets_StringWrong_false() {
        CheckBrackets checkBrackets = new CheckBrackets();
        assertFalse(checkBrackets.checkIfBracketsCorrect("{{(...]"));
    }

    @Test
    public void brackets_NoBracketsInString_false() {
        CheckBrackets checkBrackets = new CheckBrackets();
        assertFalse(checkBrackets.checkIfBracketsCorrect("fhgshg;adjf"));
    }

    @Test
    public void brackets_StringNull_false() {
        CheckBrackets checkBrackets = new CheckBrackets();
        assertFalse(checkBrackets.checkIfBracketsCorrect(null));
    }

    @Test
    public void brackets_StringEmpty_false() {
        CheckBrackets checkBrackets = new CheckBrackets();
        assertFalse(checkBrackets.checkIfBracketsCorrect(""));
    }
}