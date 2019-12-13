package com.lh.learning.leetcode.no1_10.no6;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/5/28
 * @description:
 */
public class Question6Test {
    private static Question6 question6;

    @BeforeClass
    public static void beforeClass() {
        question6 = new Question6();
    }

    @Test
    public void test() {
        Assert.assertEquals(question6.convert("LEETCODEISHIRING", 3), "LCIRETOESIIGEDHN");
        Assert.assertEquals(question6.convert("LEETCODEISHIRING", 4), "LDREOEIIECIHNTSG");
        Assert.assertEquals(question6.convert("ABC", 1), "ABC");
    }
}
