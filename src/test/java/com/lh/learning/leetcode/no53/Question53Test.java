package com.lh.learning.leetcode.no53;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/2/27
 * @description:
 */
public class Question53Test {
    private static Question53 question53;

    @BeforeClass
    public static void beforeClass() {
        question53 = new Question53();
    }

    @Test
    public void test() {
        Assert.assertEquals(question53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
        Assert.assertEquals(question53.maxSubArray(new int[]{1}), 1);
        Assert.assertEquals(question53.maxSubArray(new int[]{0}), 0);
        Assert.assertEquals(question53.maxSubArray(new int[]{-1}), -1);
        Assert.assertEquals(question53.maxSubArray(new int[]{-100000}), -100000);
    }
}
