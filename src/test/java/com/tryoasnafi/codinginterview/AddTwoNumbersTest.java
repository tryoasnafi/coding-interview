package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddTwoNumbersTest {
    AddTwoNumbers twoNumbers = new AddTwoNumbers();

    @Test
    void testAddTwoNumbers() {
        ListNode test = twoNumbers.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );

        ListNode expect = new ListNode(7, new ListNode(0, new ListNode(8)));

        int[] testToArray = { test.val, test.next.val, test.next.next.val };
        int[] expectToArray = { expect.val, expect.next.val, expect.next.next.val };

        System.out.println(Arrays.toString(expectToArray) + " = " + Arrays.toString(testToArray));

        Assertions.assertEquals(Arrays.toString(expectToArray), Arrays.toString(testToArray));
    }
}
