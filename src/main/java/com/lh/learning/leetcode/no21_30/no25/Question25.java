package com.lh.learning.leetcode.no21_30.no25;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2020/7/7
 * @description: K 个一组翻转链表
 */
public class Question25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        boolean k_size = true;
        ListNode index = head;
        for (int i = 0; i < k - 1; i++) {
            if (index == null || index.next == null) {
                k_size = false;
                break;
            }
            index = index.next;
        }
        if (k_size) {
            ListNode start = head;
            ListNode end = head;
            for (int i = 0; i < k - 1; i++) {
                ListNode next = end.next;
                end.next = next.next;
                next.next = start;
                start = next;
            }
            end.next = reverseKGroup(end.next, k);
            return start;
        } else {
            return head;
        }
    }
}
