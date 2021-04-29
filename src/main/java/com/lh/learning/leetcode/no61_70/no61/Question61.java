package com.lh.learning.leetcode.no61_70.no61;

import com.lh.learning.leetcode.util.ListNode;

/**
 * @auther: loneyfall
 * @date: 2021/3/31
 * @description: 旋转链表
 */
public class Question61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        Status status = new Status(-1, 1);
        ListNode split = findSplit(head, k, status);
        // 如果是最后一个节点，那么直接返回原链表
        if (split.next == null) {
            return head;
        } else {
            status.end.next = head;
            ListNode result = split.next;
            split.next = null;
            return result;
        }
    }

    private static class Status {
        public int backFlag;
        public int count;
        public ListNode end;

        public Status(int backFlag, int count) {
            this.backFlag = backFlag;
            this.count = count;
        }
    }

    private ListNode findSplit(ListNode index, int k, Status status) {
        // backFlag -1表示还没有找到继续往后找
        // count 表示链表长度，初始化为1
        if (status.backFlag == -1) {
            // 如果为空表示到达队尾
            if (index.next == null) {
                status.backFlag = k % status.count;
                status.end = index;
                if (status.backFlag == 0) {
                    return index;
                } else {
                    return null;
                }
            }
        }
        status.count++;
        ListNode result = findSplit(index.next, k, status);
        // 如果返回值为空，表示正在回溯,
        if (result == null) {
            status.backFlag--;
            // 如果回溯标志等于0，返回当前节点，表示从当前节点分割
            if (status.backFlag == 0) {
                return index;
            }
        }
        return result;
    }
}
