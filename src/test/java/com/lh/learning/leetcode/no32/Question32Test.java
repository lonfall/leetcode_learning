package com.lh.learning.leetcode.no32;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/17
 * @description:
 */
public class Question32Test {
    private static Question32 question32;

    @BeforeClass
    public static void beforeClass() {
        question32 = new Question32();
    }

    @Test
    public void test() {
        Assert.assertEquals(question32.longestValidParentheses("(()"), 2);
        Assert.assertEquals(question32.longestValidParentheses(")()())"), 4);
        Assert.assertEquals(question32.longestValidParentheses(")("), 0);
        Assert.assertEquals(question32.longestValidParentheses(")()())()()("), 4);
        Assert.assertEquals(question32.longestValidParentheses("(())()(()(("), 6);
    }
}
