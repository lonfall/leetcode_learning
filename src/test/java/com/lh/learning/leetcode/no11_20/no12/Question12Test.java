package com.lh.learning.leetcode.no11_20.no12;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description:
 */
public class Question12Test {
    private static Question12 question12;

    @BeforeClass
    public static void beforeClass() {
        question12 = new Question12();
    }

    @Test
    public void test() {
        Assert.assertEquals(question12.intToRoman(3), "III");
        Assert.assertEquals(question12.intToRoman(4), "IV");
        Assert.assertEquals(question12.intToRoman(9), "IX");
        Assert.assertEquals(question12.intToRoman(58), "LVIII");
        Assert.assertEquals(question12.intToRoman(1994), "MCMXCIV");
    }
}
