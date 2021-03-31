package com.lh.learning.leetcode.util;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description:
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.val);
        ListNode index = this.next;
        while (index != null) {
            sb.append("->" + index.val);
            index = index.next;
        }
        return sb.toString();
    }

    public static ListNode init(int n) {
        ListNode head = null;
        ListNode prev = null;
        for (int i = 0; i < n; i++) {
            ListNode node = new ListNode(i + 1);
            if (prev != null) {
                prev.next = node;
            } else {
                head = node;
            }
            prev = node;
        }
        return head;
    }

    public static ListNode init(int[] array) {
        ListNode head = null;
        ListNode prev = null;
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            if (prev != null) {
                prev.next = node;
            } else {
                head = node;
            }
            prev = node;
        }
        return head;
    }
}
