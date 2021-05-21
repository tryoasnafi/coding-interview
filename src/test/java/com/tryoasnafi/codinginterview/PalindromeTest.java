package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();

    @Test
    void isPalindromeEmptyValid() {
        Assertions.assertTrue(palindrome.isPalindrome(""));
    }

    @Test
    void isPalindromeOneLetterValid() {
        Assertions.assertTrue(palindrome.isPalindrome("a"));
    }

    @Test
    void isPalindromeOneWordValid() {
        Assertions.assertTrue(palindrome.isPalindrome("nababan"));
    }

    @Test
    void isPalindromeOneWordInvalid() {
        Assertions.assertFalse(palindrome.isPalindrome("Kapuyuak"));
    }

    @Test
    void isPalindromeSentenceValid() {
        Assertions.assertTrue(palindrome.isPalindrome("Go hang a salami, I'm a lasagna hog"));
    }

    @Test
    void isPalindromeSentenceInvalid() {
        Assertions.assertFalse(palindrome.isPalindrome("Character by Character"));
    }

    @Test
    void isPalindromeNumberValid() {
        Assertions.assertTrue(palindrome.isPalindrome("01010"));
    }

    @Test
    void isPalindromeNumberInvalid() {
        Assertions.assertFalse(palindrome.isPalindrome("112"));
    }

}
