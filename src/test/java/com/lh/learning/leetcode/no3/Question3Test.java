package com.lh.learning.leetcode.no3;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by loneyfall on 2019/5/24.
 */
public class Question3Test {

    private static Question3 question3;

    @BeforeClass
    public static void beforeClass() {
        question3 = new Question3();
    }

    @Test
    public void test() {
        Assert.assertNotEquals(question3.lengthOfLongestSubstring("abcabcbb"), -1);
    }
}
