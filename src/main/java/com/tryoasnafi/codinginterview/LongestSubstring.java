package com.tryoasnafi.codinginterview;

import java.util.HashMap;

/*
 * Problems from leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Space Complexity = O(n)
 * Time Complexity = O(n)
 * */

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int res = 0;
        int temp = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))){
                temp = Math.max(temp, charMap.get(s.charAt(i)) + 1);
            }

            charMap.put(s.charAt(i), i);
            res = Math.max(res, i - temp + 1);
        }

        return res;
    }
}
