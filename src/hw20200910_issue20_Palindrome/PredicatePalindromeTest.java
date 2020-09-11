package hw20200910_issue20_Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {
    @Test
    public void test_isPalindrome_true() {
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test("12321"));
        assertTrue(palindrome.test("123321"));
    }

    @Test
    public void test_notPalindrome_false() {
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertFalse(palindrome.test("82491"));
        assertFalse(palindrome.test("9653"));
    }

    @Test
    public void test_nulString_false() {
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertFalse(palindrome.test(null));
    }

    @Test
    public void test_emptyString_true() {
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test(""));
    }

    @Test
    public void test_containsOtherSymbols_true() {
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test("123*-321"));
        assertTrue(palindrome.test("123*-*21"));
    }
}
