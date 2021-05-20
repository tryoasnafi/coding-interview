package com.tryoasnafi.codinginterview;

import java.util.Stack;

public class ValidParentheses {
    /*
     * Problems from leetcode: https://leetcode.com/problems/valid-parentheses/
     * Solution using Stack
     * Space Complexity = O(n)
     * Time Complexity = O(n)
     * */
    public boolean isValid(String str) {
        if (str.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty()) return false;
            else if (stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
