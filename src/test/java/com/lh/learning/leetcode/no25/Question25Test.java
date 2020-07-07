package com.lh.learning.leetcode.no25;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/7
 * @description:
 */
public class Question25Test {
    private static Question25 question25;

    @BeforeClass
    public static void beforeClass() {
        question25 = new Question25();
    }

    @Test
    public void test() {
        String list = question25.reverseKGroup(ListNode.init(new int[]{1, 2, 3, 4, 5}), 1).toString();
        System.out.println(list);
        String list2 = question25.reverseKGroup(ListNode.init(new int[]{1, 2, 3, 4, 5}), 3).toString();
        System.out.println(list2);
    }
}
