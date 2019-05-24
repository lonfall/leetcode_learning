package com.lh.learning.leetcode.no5;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by loneyfall on 2019/5/24.
 */
public class Question5Test {
    private static Question5 question5;

    @BeforeClass
    public static void beforeClass() {
        question5 = new Question5();
    }

    @Test
    public void test() {
        Assert.assertEquals(question5.longestPalindrome("babad"), "bab");
        Assert.assertEquals(question5.longestPalindrome("cbbd"), "bb");
        Assert.assertEquals(question5.longestPalindrome(""), "");
    }
}
