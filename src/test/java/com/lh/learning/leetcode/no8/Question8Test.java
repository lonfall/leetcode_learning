package com.lh.learning.leetcode.no8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/5/30
 * @description:
 */
public class Question8Test {
    private static Question8 question8;

    @BeforeClass
    public static void beforeClass() {
        question8 = new Question8();
    }

    @Test
    public void test() {
        Assert.assertEquals(question8.myAtoi("42"), 42);
        Assert.assertEquals(question8.myAtoi("   -42"), -42);
        Assert.assertEquals(question8.myAtoi("4193 with words"), 4193);
        Assert.assertEquals(question8.myAtoi("words and 987"), 0);
        Assert.assertEquals(question8.myAtoi("-91283472332"), Integer.MIN_VALUE);
        Assert.assertEquals(question8.myAtoi("   -2147483649   something"), Integer.MIN_VALUE);
        Assert.assertEquals(question8.myAtoi("   +"), 0);
    }
}
