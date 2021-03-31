package com.lh.learning.leetcode.no51_60.no55;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/3
 * @description:
 */
public class Question55Test {
    private static Question55 question55;

    @BeforeClass
    public static void beforeClass() {
        question55 = new Question55();
    }

    @Test
    public void test() {
        System.out.println(question55.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(question55.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
