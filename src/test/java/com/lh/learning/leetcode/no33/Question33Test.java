package com.lh.learning.leetcode.no33;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/20
 * @description:
 */
public class Question33Test {
    private static Question33 question33;

    @BeforeClass
    public static void beforeClass() {
        question33 = new Question33();
    }

    @Test
    public void test() {
        Assert.assertEquals(question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0), 4);
        Assert.assertEquals(question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), -1);
        Assert.assertEquals(question33.search(new int[]{1}, 1), 0);
        Assert.assertEquals(question33.search(new int[]{1, 3}, 1), 0);
        Assert.assertEquals(question33.search(new int[]{3, 1}, 3), 0);
        Assert.assertEquals(question33.search(new int[]{1, 3, 4, 5}, 1), 0);
        Assert.assertEquals(question33.search(new int[]{3, 1}, 1), 1);
    }
}
