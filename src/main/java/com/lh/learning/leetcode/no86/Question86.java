package com.lh.learning.leetcode.no86;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2022/8/31
 * @description: 分隔链表
 */
public class Question86 {
    /*
    先向后遍历链表找到目标x，途中标记大于目标x的元素，比较后小于x的元素移到左边
    获取到x元素后遍历后半部分，小于x元素移动到大于等于x元素的左边
     */
    public ListNode partition(ListNode head, int x) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode index = head;
        ListNode prev = null, target;

        while (true) {
            if (index.val >= x) {
                target = index;
                break;
            }
            if (null == index.next) {
                return head;
            }
            prev = index;
            index = index.next;
        }
        while (true) {
            if (null == index || null == index.next) {
                return head;
            }
            if (index.next.val < x) {
                if (null != prev) {
                    prev.next = index.next;
                    prev = prev.next;
                } else {
                    prev = index.next;
                    head = prev;
                }
                index.next = index.next.next;
                prev.next = target;
            } else {
                index = index.next;
            }
        }
    }
}
