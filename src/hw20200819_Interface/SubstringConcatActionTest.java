package hw20200819_Interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubstringConcatActionTest {
    SubstringConcatActionTest() {
    }

    @Test
    public void doAction_LengthMoreThan3_Correct() {
        String str = "1234";
        Action action = new SubstringConcatAction(3);
        Assertions.assertTrue(str.length() > 3, action.doAction(str));
    }

    @Test
    public void doAction_LengthLessThan3_Ignore() {
        String str = "12";
        Action action = new SubstringConcatAction(2);
        Assertions.assertTrue(str.length() < 3, action.doAction(str));
    }

    @Test
    public void doAction_LengthNull_Ignore() {
        String str = null;
        Action action = new SubstringConcatAction(2);
        Assertions.assertNull(action.doAction((String)str));
    }
}
