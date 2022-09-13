package com.lh.learning.leetcode.no86;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2022/2/25
 * @description:
 */
public class Question86Test {
    private static Question86 question86;

    @BeforeClass
    public static void beforeClass() {
        question86 = new Question86();
    }

    @Test
    public void test() {
        System.out.println(question86.partition(ListNode.init(new int[]{1, 4, 3, 2, 5, 2}), 3));
        System.out.println(question86.partition(ListNode.init(new int[]{2, 1}), 2));
        System.out.println(question86.partition(ListNode.init(new int[]{2}), 2));
        System.out.println(question86.partition(ListNode.init(new int[]{}), 2));
        System.out.println(question86.partition(ListNode.init(new int[]{1, 1, 4, 5, 1, 4}), 4));
        System.out.println(question86.partition(ListNode.init(new int[]{1, 1}), 2));
        System.out.println(question86.partition(ListNode.init(new int[]{1, 4, 3, 0, 2, 5, 2}), 3));
    }
}
