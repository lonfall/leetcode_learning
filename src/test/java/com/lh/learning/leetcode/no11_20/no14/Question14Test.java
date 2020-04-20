package com.lh.learning.leetcode.no11_20.no14;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/16
 * @description:
 */
public class Question14Test {
    private static Question14 question14;

    @BeforeClass
    public static void beforeClass() {
        question14 = new Question14();
    }

    @Test
    public void test() {
        Assert.assertEquals(question14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        Assert.assertEquals(question14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
    }
}
