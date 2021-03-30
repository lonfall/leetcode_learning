package com.lh.learning.leetcode.no58;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description:
 */
public class Question58Test {
    private static Question58 question58;

    @BeforeClass
    public static void beforeClass() {
        question58 = new Question58();
    }

    @Test
    public void test() {
        Assert.assertEquals(question58.lengthOfLastWord("Hello World"), 5);
        Assert.assertEquals(question58.lengthOfLastWord(" "), 0);
        Assert.assertEquals(question58.lengthOfLastWord(""), 0);
        Assert.assertEquals(question58.lengthOfLastWord("a "), 1);
    }
}
