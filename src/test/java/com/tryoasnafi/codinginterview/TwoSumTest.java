package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    TwoSum test = new TwoSum();

    @Test
    void testPairSum() {
        int[] res = test.getTwoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(res));

        res = test.getTwoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(res));

        res = test.getTwoSum(new int[]{2, 2}, 4);
        System.out.println(Arrays.toString(res));

        res = test.getTwoSum(new int[]{1, 2, 3, 5, 7, 2, 7, 9}, 5);
        System.out.println(Arrays.toString(res));
    }
}
