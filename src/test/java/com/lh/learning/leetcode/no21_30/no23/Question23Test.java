package com.lh.learning.leetcode.no21_30.no23;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/2
 * @description:
 */
public class Question23Test {
    private static Question23 question23;

    @BeforeClass
    public static void beforeClass() {
        question23 = new Question23();
    }

    @Test
    public void test() {
//        ListNode[] lists = new ListNode[]{ListNode.init(new int[]{1, 4, 7}), ListNode.init(new int[]{2, 5, 8}), ListNode.init(new int[]{3, 6, 9})};
        ListNode[] lists = new ListNode[]{ListNode.init(new int[0]), ListNode.init(new int[]{1})};
        System.out.println(question23.mergeKLists(lists).toString());
    }
}
