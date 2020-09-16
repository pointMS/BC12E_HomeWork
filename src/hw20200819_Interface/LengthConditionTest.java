package hw20200819_Interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthConditionTest {
    LengthConditionTest() {
    }

    @Test
    public void test_LengthIsNull_False() {
        String str = null;
        Condition condition = new LengthCondition(2);
        Assertions.assertFalse(condition.test((String)str));
    }

    @Test
    public void test_LengthEmpty_False() {
        String str = "";
        Condition condition = new LengthCondition(2);
        Assertions.assertFalse(condition.test(str));
    }
}
