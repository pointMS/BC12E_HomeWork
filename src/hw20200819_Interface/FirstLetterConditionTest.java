package hw20200819_Interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstLetterConditionTest {
    FirstLetterConditionTest() {
    }

    @Test
    public void test_FirstLetter_True() {
        String str = "abcd";
        Condition condition = new FirstLetterCondition(str);
        Assertions.assertTrue(condition.test(str));
    }

    @Test
    public void test_Null_False() {
        String str = null;
        Condition condition = new FirstLetterCondition((String)str);
        Assertions.assertFalse(condition.test((String)str));
    }
}
