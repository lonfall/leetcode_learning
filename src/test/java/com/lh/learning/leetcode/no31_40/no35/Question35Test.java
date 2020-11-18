package com.lh.learning.leetcode.no31_40.no35;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/30
 * @description:
 */
public class Question35Test {
    private static Question35 question35;

    @BeforeClass
    public static void beforeClass() {
        question35 = new Question35();
    }

    @Test
    public void test() {
        Assert.assertEquals(question35.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        Assert.assertEquals(question35.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        Assert.assertEquals(question35.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
        Assert.assertEquals(question35.searchInsert(new int[]{1, 3, 5, 6}, 0), 0);
    }
}
