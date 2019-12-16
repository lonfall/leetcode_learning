package com.lh.learning.leetcode.no13;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/16
 * @description:
 */
public class Question13Test {
    private static Question13 question13;

    @BeforeClass
    public static void beforeClass() {
        question13 = new Question13();
    }

    @Test
    public void test() {
        Assert.assertEquals(question13.romanToInt("III"), 3);
        Assert.assertEquals(question13.romanToInt("IV"), 4);
        Assert.assertEquals(question13.romanToInt("IX"), 9);
        Assert.assertEquals(question13.romanToInt("LVIII"), 58);
        Assert.assertEquals(question13.romanToInt("MCMXCIV"), 1994);
    }
}
