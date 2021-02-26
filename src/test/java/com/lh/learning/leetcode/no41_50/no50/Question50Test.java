package com.lh.learning.leetcode.no41_50.no50;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/1/28
 * @description:
 */
public class Question50Test {
    private static Question50 question50;

    @BeforeClass
    public static void beforeClass() {
        question50 = new Question50();
    }

    @Test
    public void test() {
//        System.out.println(question50.myPow(2.00000d, 10));
//        System.out.println(question50.myPow(2.10000d, 3));
//        System.out.println(question50.myPow(2.00000d, -2));
//        System.out.println(question50.myPow(0.44528d, 0));
        System.out.println(question50.myPow(2.00000d, -2147483648));
    }
}
