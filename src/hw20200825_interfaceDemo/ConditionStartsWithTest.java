package hw20200825_interfaceDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionStartsWithTest {
    @Test
    public void test_StringNull_False(){
        String str = null;
        Condition condition = new ConditionStartsWith();
        assertFalse(condition.test(str));
    }
    @Test
    public void test_StringEmpty_False(){
        String str = "";
        Condition condition = new ConditionStartsWith();
        assertFalse(condition.test(str));
    }
    @Test
    public void test_StringStartsWithP_True(){
        String str = "pppp";
        Condition condition = new ConditionStartsWith();
        assertTrue(condition.test(str));
    }
}