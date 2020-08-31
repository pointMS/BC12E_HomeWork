package interfaceDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionSubstringTest {
    @Test
    public void action_StringNull_returnNull() {
        String str = null;
        Action action = new ActionSubstring();
        assertNull(action.doAction(str));
    }

    @Test
    public void action_StringEmpty_returnNull() {
        String str = "";
        Action action = new ActionSubstring();
        assertNull(action.doAction(str));
    }

    @Test
    public void action_Substring_doAction(){
        String str = "Checking";
        Action action = new ActionSubstring();
        assertEquals("Ch.", action.doAction(str));
    }

}