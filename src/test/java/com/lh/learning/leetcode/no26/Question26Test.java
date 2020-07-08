package com.lh.learning.leetcode.no26;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/8
 * @description:
 */
public class Question26Test {
    private static Question26 question26;

    @BeforeClass
    public static void beforeClass() {
        question26 = new Question26();
    }

    @Test
    public void test() {
        int[] items = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = question26.removeDuplicates(items);
        System.out.println(len);
    }
}
