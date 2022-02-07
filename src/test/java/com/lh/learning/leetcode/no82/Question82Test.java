package com.lh.learning.leetcode.no82;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2022/2/7
 * @description:
 */
public class Question82Test {
    private static Question82 question82;

    @BeforeClass
    public static void beforeClass() {
        question82 = new Question82();
    }

    @Test
    public void test() {
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 2, 3, 3, 4, 4, 5, 6})));
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 3})));
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 3, 4, 4})));
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 2, 2})));
        System.out.println(question82.deleteDuplicates(ListNode.init(new int[]{1, 2, 2, 2, 3})));
        System.out.println(question82.deleteDuplicates(null));
    }
}
