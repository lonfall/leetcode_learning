package com.lh.learning.leetcode.no41_50.no43;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/1/11
 * @description:
 */
public class Question43Test {
    private static Question43 question43;

    @BeforeClass
    public static void beforeClass() {
        question43 = new Question43();
    }

    @Test
    public void test() {
        Assert.assertEquals("6", question43.multiply("2", "3"));
        Assert.assertEquals("56088", question43.multiply("123", "456"));
        Assert.assertEquals("" + (12354918L * 8911456L), question43.multiply("12354918", "8911456"));
    }
}
