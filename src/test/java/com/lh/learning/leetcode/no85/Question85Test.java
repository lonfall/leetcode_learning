package com.lh.learning.leetcode.no85;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2022/2/10
 * @description:
 */
public class Question85Test {
    private static Question85 question85;

    @BeforeClass
    public static void beforeClass() {
        question85 = new Question85();
    }

    @Test
    public void test() {
        System.out.println(question85.maximalRectangle(new char[][]{{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
        System.out.println(question85.maximalRectangle(null));
        System.out.println(question85.maximalRectangle(new char[][]{}));
        System.out.println(question85.maximalRectangle(new char[][]{{'0'}}));
        System.out.println(question85.maximalRectangle(new char[][]{{'1'}}));
        System.out.println(question85.maximalRectangle(new char[][]{{'0', '0'}}));
    }
}
