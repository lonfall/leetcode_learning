package com.lh.learning.leetcode.no21_30.no24;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/3
 * @description:
 */
public class Question24Test {
    private static Question24 question24;

    @BeforeClass
    public static void beforeClass() {
        question24 = new Question24();
    }

    @Test
    public void test() {
        System.out.println(question24.swapPairs(ListNode.init(new int[]{1, 2, 3, 4, 5})));
    }
}
