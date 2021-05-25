package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    LongestSubstring substring = new LongestSubstring();

    @Test
    void testLongestSubstringEmpty(){
        int res = substring.lengthOfLongestSubstring("");
        Assertions.assertEquals(0, res);
    }

    @Test
    void testLongestSubstringSpace(){
        int res = substring.lengthOfLongestSubstring(" ");
        Assertions.assertEquals(1, res);
    }

    @Test
    void testLongestSubstringOneWord(){
        int res = substring.lengthOfLongestSubstring("dcdac");
        Assertions.assertEquals(3, res);
    }

    @Test
    void testLongestSubstringOneWord_2(){
        int res = substring.lengthOfLongestSubstring("abbba");
        Assertions.assertEquals(2, res);
    }
}
