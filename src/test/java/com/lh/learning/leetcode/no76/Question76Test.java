package com.lh.learning.leetcode.no76;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/7/17
 * @description:
 */
public class Question76Test {
    private static Question76 question76;

    @BeforeClass
    public static void beforeClass() {
        question76 = new Question76();
    }

    @Test
    public void test() {
        Assert.assertEquals(question76.minWindow("DBSADOBECODEBANC", "ABC"), "BANC");
        Assert.assertEquals(question76.minWindow("vzxcoivpoiginojgfasd", "ads"), "asd");
        Assert.assertEquals(question76.minWindow("a", "a"), "a");
        Assert.assertEquals(question76.minWindow("a", "aa"), "");
        Assert.assertEquals(question76.minWindow("a", ""), "");
        Assert.assertEquals(question76.minWindow("ab", "a"), "a");
    }
}
