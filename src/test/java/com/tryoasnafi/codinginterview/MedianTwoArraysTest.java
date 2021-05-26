package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianTwoArraysTest {
    MedianTwoArrays twoArrays = new MedianTwoArrays();

    @Test
    void testMedianTwoArraysOdd() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double res = twoArrays.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(2.0, res);
    }

    @Test
    void testMedianTwoArraysEven() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = twoArrays.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(2.5, res);
    }
}
