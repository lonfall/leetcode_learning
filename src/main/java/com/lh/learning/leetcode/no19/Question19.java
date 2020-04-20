package com.lh.learning.leetcode.no19;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description: 删除链表的倒数第N个节点
 */
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode prev = head;
        ListNode index = head;

        while (index != null) {
            index = index.next;
            count++;
            if (count > n + 1) {
                prev = prev.next;
            }
        }
        System.out.println(prev.val);
        System.out.println(count);
        if (count == n) {
            return head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }
}
