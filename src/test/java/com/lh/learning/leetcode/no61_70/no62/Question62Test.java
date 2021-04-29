package com.lh.learning.leetcode.no61_70.no62;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/2
 * @description:
 */
public class Question62Test {
    private static Question62 question62;

    @BeforeClass
    public static void beforeClass() {
        question62 = new Question62();
    }

    @Test
    public void test() {
        System.out.println(question62.uniquePaths(19, 13));
    }
}
