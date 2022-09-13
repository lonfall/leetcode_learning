package com.lh.learning.leetcode.no86;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2022/2/11
 * @description: 分隔链表
 */
public class Question86Old {
    public ListNode partition(ListNode head, int x) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode p1 = null;
        ListNode p2 = null;
        if (head.val < x) {
            p1 = head;
        } else {
            p2 = head;
        }
        while (null == p2 || null != p2.next || (null != p1 && null != p1.next)) {
            if (null == p2) {
                if (p1.next.val < x) {
                    p1 = p1.next;
                } else {
                    p2 = p1.next;
                }
            } else if (null == p1) {
                if (p2.next.val < x) {
                    p1 = p2.next;
                    p2.next = p1.next;
                    p1.next = head;
                    head = p1;
                } else {
                    p2 = p2.next;
                }
            } else {
                if (p2.next.val < x) {
                    ListNode t = p2.next;
                    p2.next = t.next;
                    t.next = p1.next;
                    p1.next = t;
                    p1 = t;
                } else {
                    p2 = p2.next;
                }
            }
        }
        return head;
    }
}
