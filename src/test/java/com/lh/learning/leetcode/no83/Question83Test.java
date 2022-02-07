package com.lh.learning.leetcode.no83;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2022/2/7
 * @description:
 */
public class Question83Test {
    private static Question83 question83;

    @BeforeClass
    public static void beforeClass() {
        question83 = new Question83();
    }

    @Test
    public void test() {
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 2, 3, 3, 4, 4, 5, 6})));
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 3})));
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 3, 4, 4})));
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 1, 1, 2, 2, 2})));
        System.out.println(question83.deleteDuplicates(ListNode.init(new int[]{1, 2, 2, 2, 3})));
        System.out.println(question83.deleteDuplicates(null));
    }
}
