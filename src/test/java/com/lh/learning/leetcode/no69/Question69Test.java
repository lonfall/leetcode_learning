package com.lh.learning.leetcode.no69;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/23
 * @description:
 */
public class Question69Test {
    private static Question69 question69;

    @BeforeClass
    public static void beforeClass() {
        question69 = new Question69();
        official69 = new Official69();
    }

    @Test
    public void test() {
        Assert.assertEquals(question69.mySqrt(4), 2);
        Assert.assertEquals(question69.mySqrt(8), 2);
        Assert.assertEquals(question69.mySqrt(9), 3);
        Assert.assertEquals(question69.mySqrt(12580), 112);
        Assert.assertEquals(question69.mySqrt(2147395599), 46339);
        Assert.assertEquals(question69.mySqrt(2147395600), 46340);
        Assert.assertEquals(question69.mySqrt(Integer.MAX_VALUE), 46340);
    }

    public static Official69 official69;

    @Test
    public void testOfficial() {
        Assert.assertEquals(official69.mySqrt(4), 2);
        Assert.assertEquals(official69.mySqrt(8), 2);
        Assert.assertEquals(official69.mySqrt(9), 3);
        Assert.assertEquals(official69.mySqrt(12580), 112);
        Assert.assertEquals(official69.mySqrt(2147395599), 46339);
        Assert.assertEquals(official69.mySqrt(2147395600), 46340);
        Assert.assertEquals(official69.mySqrt(Integer.MAX_VALUE), 46340);
    }
}
