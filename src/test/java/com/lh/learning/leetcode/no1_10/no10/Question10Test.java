package com.lh.learning.leetcode.no1_10.no10;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/8/28
 * @description:
 */
public class Question10Test {
    private static Question10 question10;

    @BeforeClass
    public static void beforeClass() {
        question10 = new Question10();
    }

    @Test
    public void test() {
        Assert.assertFalse(question10.isMatch("aa", "a"));
        Assert.assertTrue(question10.isMatch("aa", "a*"));
        Assert.assertTrue(question10.isMatch("ab", ".*"));
        Assert.assertTrue(question10.isMatch("aab", "c*a*b"));
        Assert.assertFalse(question10.isMatch("mississippi", "mis*is*p*."));
        Assert.assertFalse(question10.isMatch("a", ".*..a*"));
        Assert.assertTrue(question10.isMatch("", ".*"));
    }
}
