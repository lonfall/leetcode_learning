package com.lh.learning.leetcode.no11_20.no20;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description:
 */
public class Question20Test {
    private static Question20 question20;

    @BeforeClass
    public static void beforeClass() {
        question20 = new Question20();
    }

    @Test
    public void test() {
        Assert.assertTrue(question20.isValid("()"));
        Assert.assertTrue(question20.isValid("()[]{}"));
        Assert.assertFalse(question20.isValid("(]"));
        Assert.assertFalse(question20.isValid("([)]"));
        Assert.assertTrue(question20.isValid("{[]}"));
    }
}
