package com.lh.learning.leetcode.no61_70.no61;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/31
 * @description:
 */
public class Question61Test {
    private static Question61 question61;

    @BeforeClass
    public static void beforeClass() {
        question61 = new Question61();
    }

    @Test
    public void test() {
        System.out.println(question61.rotateRight(ListNode.init(5), 2));
        System.out.println(question61.rotateRight(ListNode.init(new int[]{0, 1, 2}), 4));
    }
}
