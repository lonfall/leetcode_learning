package com.lh.learning.leetcode.no84;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2022/2/9
 * @description:
 */
public class Question84Test {
    private static Question84 question84;

    @BeforeClass
    public static void beforeClass() {
        question84 = new Question84();
    }

    @Test
    public void test() {
        System.out.println(question84.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(question84.largestRectangleArea(new int[]{2, 4}));
        System.out.println(question84.largestRectangleArea(new int[]{1}));
    }
}
