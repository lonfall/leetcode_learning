package com.lh.learning.leetcode.no16;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/19
 * @description:
 */
public class Question16Test {

    private static Question16 question16;

    @BeforeClass
    public static void beforeClass() {
        question16 = new Question16();
    }

    @Test
    public void test() {
        System.out.println(question16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
