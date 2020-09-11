package hw20200910_issue20_Palindrome;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionToStringTest {
    @Test
    public void apply_nullList_emptyList() {
        List<String> list = new ArrayList<>();
        FunctionToString function = new FunctionToString(new PredicatePalindrome());
        assertEquals(function.apply(null), list);
    }

    @Test
    public void apply_palindromeList_palindromeList() {
        List<String> listIn = Arrays.asList("asdfdsa", "12344321", "kjgdfkjg", "4543213");
        List<String> listOut = Arrays.asList("asdfdsa", "12344321");
        FunctionToString function = new FunctionToString(new PredicatePalindrome());
        assertEquals(listOut, function.apply(listIn));
    }

    @Test
    public void apply_noPalindrome_emptyList() {
        List<String> listIn = Arrays.asList("kjgdfkjg", "4543213");
        List<String> listOut = Arrays.asList();
        FunctionToString function = new FunctionToString(new PredicatePalindrome());
        assertEquals(listOut, function.apply(listIn));
    }
}
