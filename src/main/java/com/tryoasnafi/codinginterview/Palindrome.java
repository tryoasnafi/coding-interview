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

        for (int i = 0; i < newValue.length() / 2; i++) {
            // If not same letter is not palindrome
            if (!(newValue.charAt(i) == newValue.charAt(newValue.length() - i - 1))) {
                return false;
            }
        }
        // If the compare iteration complete is always return true
        return true;
    }
}
