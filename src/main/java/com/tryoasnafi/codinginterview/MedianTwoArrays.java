package com.tryoasnafi.codinginterview;

import java.util.Arrays;

/*
 * Problems from leetcode: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * */

public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merger = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merger, 0, nums1.length);
        System.arraycopy(nums2, 0, merger, nums1.length, nums2.length);
        Arrays.sort(merger);
        if (merger.length % 2 != 0){
            return merger[merger.length / 2];
        }
        return (double) (merger[(merger.length / 2) - 1] + merger[merger.length / 2]) / 2;
    }
}
