package com.tryoasnafi.codinginterview;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
 * Problems from leetcode: https://leetcode.com/problems/add-two-numbers/x
 * */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode root = new ListNode(0);
        ListNode tail = root;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            if (carry > 9) {
                tail.next = new ListNode(carry - 10);
                carry = 1;
            } else {
                tail.next = new ListNode(carry);
                carry = 0;
            }
            tail = tail.next;
        }
        return root.next;
    }
}
