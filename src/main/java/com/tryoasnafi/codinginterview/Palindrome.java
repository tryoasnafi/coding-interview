package com.tryoasnafi.codinginterview;

import java.util.regex.Pattern;

public class Palindrome {
    public boolean isPalindrome(String value) {
        // If length of string is one or zero, just return true
        if (value.length() <= 1) return true;
        // Remove all symbols and convert to lowercase
        String newValue = Pattern.compile("[^a-zA-Z0-9]")
                .matcher(value.toLowerCase())
                .replaceAll("");

        return isPalindromeRecursive(newValue, 0);
    }

    private  boolean isPalindromeRecursive(String value, int i) {
        if (i < value.length() / 2) {
            // If not same letter is not palindrome
            if (!(value.charAt(i) == value.charAt(value.length() - i - 1))) {
                return false;
            }
            return isPalindromeRecursive(value, i + 1);
        }
        // If the compare iteration complete is always return true
        return true;
    }
}
