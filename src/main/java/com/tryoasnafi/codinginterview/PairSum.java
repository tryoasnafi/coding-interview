package com.tryoasnafi.codinginterview;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    public void checkPairInArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        // 1. Sorting Array
        Arrays.sort(arr);
        // 2. Find two candidates
        while (low < high) {
            if (arr[low] + arr[high] == target) {
                count++;
                System.out.println(arr[low] + " " + arr[high]);
                low++;
                high--;
            } else if (arr[low] + arr[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        if (count == 0) System.out.println("No valid pair exists!");
    }
}
