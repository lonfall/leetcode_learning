package com.lh.learning.leetcode.no51;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/2/25
 * @description:
 */
public class Question51Test {
    private static Question51 question51;

    @BeforeClass
    public static void beforeClass() {
        question51 = new Question51();
    }

    @Test
    public void test() {
        System.out.println(question51.solveNQueens(5));
    }
}
