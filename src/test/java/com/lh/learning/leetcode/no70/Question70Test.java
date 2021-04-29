package com.lh.learning.leetcode.no70;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/23
 * @description:
 */
public class Question70Test {
    private static Question70 question70;

    @BeforeClass
    public static void beforeClass() {
        question70 = new Question70();
    }

    @Test
    public void test() {
        System.out.println(question70.climbStairs(2));
        System.out.println(question70.climbStairs(3));
    }
}
