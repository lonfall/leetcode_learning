package com.lh.learning.leetcode.no83;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2022/2/7
 * @description: 删除排序链表中的重复元素
 */
public class Question83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode p1 = head;
        while (null != p1.next) {
            if (p1.next.val == p1.val) {
                p1.next = p1.next.next;
            } else {
                p1 = p1.next;
            }
        }
        return head;
    }
}
