package com.lh.learning.leetcode.no11_20.no11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description:
 */
public class Question11Test {
    private static Question11 question11;

    @BeforeClass
    public static void beforeClass() {
        question11 = new Question11();
    }

    @Test
    public void test() {
        Assert.assertEquals(question11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
    }
}
