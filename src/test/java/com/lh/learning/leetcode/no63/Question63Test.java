package com.lh.learning.leetcode.no63;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/7
 * @description:
 */
public class Question63Test {
    private static Question63 question63;

    @BeforeClass
    public static void beforeClass() {
        question63 = new Question63();
    }

    @Test
    public void test() {
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{0, 0}, {0, 1}}));
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{1, 0}}));
    }
}
