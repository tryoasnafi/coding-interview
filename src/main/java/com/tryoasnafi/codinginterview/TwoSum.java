package com.tryoasnafi.codinginterview;

import java.util.HashMap;

public class TwoSum {
    /*
    * Problems from leetcode: https://leetcode.com/problems/two-sum/
    * Solution using Hashmap
    * Space Complexity = O(n)
    * Time Complexity = O(n)
    * */
    public int[] getTwoSum(int[] nums, int target) {
        if (nums.length == 2) return new int[]{0, 1};

        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                return new int[]{pairs.get(nums[i]), i};
            }
            pairs.put(target - nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
