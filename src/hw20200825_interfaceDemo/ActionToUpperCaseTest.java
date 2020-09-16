package hw20200825_interfaceDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionToUpperCaseTest {
    @Test
    public void action_ToUpperCase_correct() {
        String forCompare = "ONE_two_Three";
        Action action = new ActionToUpperCase();
        assertEquals("ONE_TWO_THREE", action.doAction(forCompare));
    }

    @Test
    public void action_StringNull_returnNull() {
        String str = null;
        Action action = new ActionToUpperCase();
        assertNull(action.doAction(str));
    }

    @Test
    public void action_EmptyStr_returnNull() {
        String str = "";
        Action action = new ActionToUpperCase();
        assertEquals("", action.doAction(str));
    }
}