package com.lh.learning.leetcode.no67;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/17
 * @description:
 */
public class Question67Test {
    private static Question67 question67;

    @BeforeClass
    public static void beforeClass() {
        question67 = new Question67();
    }

    @Test
    public void test() {
        Assert.assertEquals(question67.addBinary("11", "1"), "100");
        Assert.assertEquals(question67.addBinary("1010", "1011"), "10101");
    }
}
