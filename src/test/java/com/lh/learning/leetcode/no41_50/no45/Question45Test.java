package com.lh.learning.leetcode.no41_50.no45;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description:
 */
public class Question45Test {
    private static Question45 question45;

    @BeforeClass
    public static void beforeClass() {
        question45 = new Question45();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, question45.jump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(4, question45.jump(new int[]{2, 3, 2, 1, 1, 1, 4}));
    }
}
