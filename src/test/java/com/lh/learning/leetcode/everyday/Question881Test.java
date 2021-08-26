package com.lh.learning.leetcode.everyday;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/8/26
 * @description:
 */
public class Question881Test {
    private static Question881 question881;

    @BeforeClass
    public static void beforeClass() {
        question881 = new Question881();
    }

    @Test
    public void test() {
        Assert.assertEquals(question881.numRescueBoats(new int[]{1, 2}, 3), 1);
        Assert.assertEquals(question881.numRescueBoats(new int[]{3, 2, 2, 1}, 3), 3);
        Assert.assertEquals(question881.numRescueBoats(new int[]{3, 5, 3, 4}, 5), 4);
        Assert.assertEquals(question881.numRescueBoats(new int[]{2, 2}, 6), 1);
        Assert.assertEquals(question881.numRescueBoats(new int[]{2, 2, 1, 3}, 6), 2);
    }
}
