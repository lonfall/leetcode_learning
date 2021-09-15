package com.lh.learning.leetcode.no71_80.no71;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/5/6
 * @description:
 */
public class Question71Test {
    private static Question71 question71;

    @BeforeClass
    public static void beforeClass() {
        question71 = new Question71();
    }

    @Test
    public void test() {
        Assert.assertEquals(question71.simplifyPath("/home/"), "/home");
        Assert.assertEquals(question71.simplifyPath("/../"), "/");
        Assert.assertEquals(question71.simplifyPath("/home//foo/"), "/home/foo");
        Assert.assertEquals(question71.simplifyPath("/a/./b/../../c/"), "/c");
        Assert.assertEquals(question71.simplifyPath("/a//b////c/d//././/.."), "/a/b/c");
    }
}
