package com.lh.learning.leetcode.no71_80.no72;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/5/14
 * @description:
 */
public class Question72Test {
    private static Question72 question72;

    @BeforeClass
    public static void beforeClass() {
        question72 = new Question72();
    }

    @Test
    public void test() {
        Assert.assertEquals(question72.minDistance("horse", "ros"), 3);
        Assert.assertEquals(question72.minDistance("intention", "execution"), 5);
    }
}
