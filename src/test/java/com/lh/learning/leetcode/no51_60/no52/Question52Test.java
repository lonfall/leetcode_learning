package com.lh.learning.leetcode.no51_60.no52;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/2/27
 * @description:
 */
public class Question52Test {
    private static Question52 question52;

    @BeforeClass
    public static void beforeClass() {
        question52 = new Question52();
    }

    @Test
    public void test() {
        System.out.println(question52.totalNQueens(7));
    }
}
