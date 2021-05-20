package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses vp = new ValidParentheses();

    @Test
    void validParenthesesTest() {
        Assertions.assertTrue(vp.isValid("({}[])"));
        Assertions.assertTrue(vp.isValid("((([{}])))"));
        Assertions.assertTrue(vp.isValid("({}[])"));
    }

    @Test
    void inValidParenthesesTest() {
        Assertions.assertFalse(vp.isValid("]"));
        Assertions.assertFalse(vp.isValid("(((("));
        Assertions.assertFalse(vp.isValid("{}["));
        Assertions.assertFalse(vp.isValid("{({])}"));
    }
}
