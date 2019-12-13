package com.lh.learning.leetcode.no1_10.no7;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/5/29
 * @description:
 */
public class Question7Test {
    private static Question7 question7;

    @BeforeClass
    public static void beforeClass() {
        question7 = new Question7();
    }

    @Test
    public void test() {
        Assert.assertEquals(question7.reverse(-2147483648), 0);
    }
}
