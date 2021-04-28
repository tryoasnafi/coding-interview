package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Test;

public class PairSumTest {
    PairSum pairSum = new PairSum();

    @Test
    void testPairSum() {
        int[] arr = {1, 2, 3, 5, 7, 2, 7, 9};
        pairSum.checkPairInArray(arr, 17);
    }
}
