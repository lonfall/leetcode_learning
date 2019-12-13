package com.lh.learning.leetcode.no1_10.no9;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/8/5
 * @description:
 */
public class Question9Test {
    private static Question9 question9;

    @BeforeClass
    public static void beforeClass() {
        question9 = new Question9();
    }

    @Test
    public void test() {
        Assert.assertFalse(question9.isPalindrome(123456));
        Assert.assertTrue(question9.isPalindrome(12321));
        Assert.assertFalse(question9.isPalindrome(-12321));
        Assert.assertFalse(question9.isPalindrome(10));
        Assert.assertTrue(question9.isPalindrome(121));
        Assert.assertTrue(question9.isPalindrome(1410110141));
    }
}
