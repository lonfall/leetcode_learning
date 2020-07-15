package com.lh.learning.leetcode.no21_30.no23;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2020/7/2
 * @description: 合并K个排序链表
 */
public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if (k == 0) {
            return null;
        }
        ListNode start = lists[0];
        ListNode index = start;
        ListNode prev = null;
        boolean end = false;
        if (start == null) {
            for (int i = 0; i < k; i++) {
                end = true;
                if (lists[i] == null) {
                    continue;
                }
                end = false;
                start = lists[i];
                index = start;
                lists[i] = null;
                break;
            }
        }
        while (!end) {
            end = true;
            boolean find = false;
            for (int i = 1; i < k; i++) {
                if (lists[i] == null) {
                    continue;
                }
                end = false;
                ListNode head = lists[i];
                ListNode index_i = lists[i];
                ListNode prev_i = null;
                if (index == null) {
                    find = true;
                    lists[i] = null;
                    prev.next = head;
                    index = head;
                } else {
                    while (index_i.val <= index.val) {
                        prev_i = index_i;
                        index_i = index_i.next;
                        if (index_i == null || index_i.val > index.val) {
                            find = true;
                            lists[i] = index_i;
                            prev_i.next = index;
                            if (prev != null) {
                                prev.next = head;
                            } else {
                                start = head;
                                prev = null;
                            }
                            index = head;
                            break;
                        }
                    }
                }
            }
            if (!find) {
                prev = index;
                index = index.next;
            }
        }
        return start;
    }
}
