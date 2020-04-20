package com.lh.learning.leetcode.no21;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description: 合并两个有序链表
 */
public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode s1 = l1;
        if (l1.val > l2.val) {
            s1 = l2;
            l2 = l1;
            l1 = s1;
        }
        while (s1 != null && l2 != null) {
            if (s1.next == null) {
                ListNode t = l2.next;
                l2.next = null;
                s1.next = l2;
                s1 = s1.next;
                l2 = t;
                continue;
            }
            if (l2.val >= s1.val && l2.val <= s1.next.val) {
                ListNode t = l2.next;
                l2.next = s1.next;
                s1.next = l2;
                s1 = s1.next;
                l2 = t;
            } else {
                s1 = s1.next;
            }
        }
        return l1;
    }
}
