package com.lh.learning.leetcode.no41;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/11/18
 * @description:
 */
public class Question41Test {
    private static Question41 question41;

    @BeforeClass
    public static void beforeClass() {
        question41 = new Question41();
    }

    @Test
    public void test() {
        Assert.assertEquals(question41.firstMissingPositive(new int[]{1, 2, 0}), 3);
        Assert.assertEquals(question41.firstMissingPositive(new int[]{3, 4, -1, 1}), 2);
        Assert.assertEquals(question41.firstMissingPositive(new int[]{7, 8, 9, 11, 12}), 1);
        Assert.assertEquals(question41.firstMissingPositive(new int[]{1, 2, 3, 4, 5, 6, 7}), 8);
        Assert.assertEquals(question41.firstMissingPositive(new int[]{7, 6, 5, 4, 3, 2, 1}), 8);
    }
}
