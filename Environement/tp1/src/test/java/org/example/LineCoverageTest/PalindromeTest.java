package org.example.LineCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testEmptyStringIsPalindrome() {
        Assertions.assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void StringNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void StringOneChar() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void IsPalindrome() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        assertTrue(Palindrome.isPalindrome("level"));
    }

    @Test
    void IsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("nana"));
        assertFalse(Palindrome.isPalindrome("comon"));
    }
}