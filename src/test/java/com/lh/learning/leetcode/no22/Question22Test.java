package com.lh.learning.leetcode.no22;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2020/7/1
 * @description:
 */
public class Question22Test {
    private static Question22 question22;

    @BeforeClass
    public static void beforeClass() {
        question22 = new Question22();
    }

    @Test
    public void test() {
        List<String> result = new Question22().generateParenthesis(3);
        System.out.println(result);
    }
}
