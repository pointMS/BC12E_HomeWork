package hw20200910_issue20_Palindrome;

import java.util.function.Predicate;

public class PredicatePalindrome implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s == null) return false;

        return new StringBuffer(s.replaceAll("[^A-Za-zА-Яа-я0-9]","")).
                reverse().toString().equalsIgnoreCase(s.replaceAll("[^A-Za-zА-Яа-я0-9]",""));
    }
}
