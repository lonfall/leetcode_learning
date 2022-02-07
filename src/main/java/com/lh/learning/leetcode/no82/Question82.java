package com.lh.learning.leetcode.no82;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2022/2/7
 * @description: 删除排序链表中的重复元素 II
 */
public class Question82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode p1 = null;
        ListNode p2 = head;
        boolean repeat = false;
        while (null != p2.next) {
            if (p2.next.val == p2.val) {
                p2 = p2.next;
                repeat = true;
            } else if (repeat) {
                if (null == p1) {
                    head = p2.next;
                } else {
                    p1.next = p2.next;
                }
                p2 = p2.next;
                repeat = false;
            } else {
                p1 = p2;
                p2 = p2.next;
            }
        }
        if (repeat) {
            if (null == p1) {
                head = null;
            } else {
                p1.next = null;
            }
        }
        return head;
    }
}
