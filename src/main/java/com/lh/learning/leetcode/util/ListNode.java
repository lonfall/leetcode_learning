package com.lh.learning.leetcode.util;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description:
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.val);
        ListNode index = this.next;
        while (index != null) {
            sb.append("-->" + index.val);
            index = index.next;
        }
        return sb.toString();
    }
}
