package com.lh.learning.leetcode.no61_70.no64;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/8
 * @description:
 */
public class Question64Test {
    private static Question64 question64;

    @BeforeClass
    public static void beforeClass() {
        question64 = new Question64();
    }

    @Test
    public void test() {
        System.out.println(question64.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println(question64.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
