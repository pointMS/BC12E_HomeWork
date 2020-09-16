package hw20200825_interfaceDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionLengthTest {
    @Test
    public void test_StringNull_returnFalse(){
        String str = null;
        Condition condition = new ConditionLength();
        assertFalse(condition.test(str));
    }
    @Test
    public void test_StringEmpty_returnFalse(){
        String str = "";
        Condition condition = new ConditionLength();
        assertFalse(condition.test(str));
    }
    @Test
    public void test_StringLengthMoreThan4_True(){
        String str = "check";
        Condition condition = new ConditionLength();
        assertTrue(condition.test(str));
    }

}