package com.lh.learning.leetcode.no21_30.no24;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2020/7/3
 * @description: 两两交换链表中的节点
 */
public class Question24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode left = head;
        ListNode right = left.next;

        head = right;
        while (true) {
            if (left == null || right == null) {
                break;
            }
            if (prev != null) {
                prev.next = right;
            }
            if (right != null) {
                left.next = right.next;
                right.next = left;
            }
            if (left.next == null) {
                break;
            }
            prev = left;
            left = prev.next;
            right = left.next;
        }
        return head;
    }
}
