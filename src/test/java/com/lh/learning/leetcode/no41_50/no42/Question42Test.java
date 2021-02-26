package com.lh.learning.leetcode.no41_50.no42;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/12/9
 * @description:
 */
public class Question42Test {
    private static Question42 question42;

    @BeforeClass
    public static void beforeClass() {
        question42 = new Question42();
    }

    @Test
    public void test() {
        Assert.assertEquals(question42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
        Assert.assertEquals(question42.trap(new int[]{4, 2, 0, 3, 2, 5}), 9);
    }
}
