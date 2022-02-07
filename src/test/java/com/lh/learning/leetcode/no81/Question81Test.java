package com.lh.learning.leetcode.no81;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/9/15
 * @description:
 */
public class Question81Test {
    private static Question81 question81;

    @BeforeClass
    public static void beforeClass() {
        question81 = new Question81();
    }

    @Test
    public void test() {
        Assert.assertEquals(question81.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0), true);
        Assert.assertEquals(question81.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3), false);
        Assert.assertEquals(question81.search(new int[]{2, 5, 6, 0, 0, 1}, 1), true);
        Assert.assertEquals(question81.search(new int[]{2, 5, 6, -1, 0, 0, 1}, 7), false);
        Assert.assertEquals(question81.search(new int[]{5, 6, -1, 0, 0, 1, 2}, 7), false);
//        Assert.assertEquals(question81.search(new int[]{1, 0, 1, 1, 1}, 0), true);
//        Assert.assertEquals(question81.search(new int[]{1, 1, 1, 0, 1}, 0), true);
//        Assert.assertEquals(question81.search(new int[]{1, 1, 3, 1, 1}, 0), false);
//        Assert.assertEquals(question81.search(new int[]{1, 1, 1, 1, 1}, 2), false);
    }
}
