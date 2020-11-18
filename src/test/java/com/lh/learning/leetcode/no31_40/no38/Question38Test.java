package com.lh.learning.leetcode.no31_40.no38;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/8/6
 * @description:
 */
public class Question38Test {
    private static Question38 question38;

    @BeforeClass
    public static void beforeClass() {
        question38 = new Question38();
    }

    @Test
    public void test() {
        System.out.println(question38.countAndSay(1));
        System.out.println(question38.countAndSay(4));
        System.out.println(question38.countAndSay(6));
        System.out.println(question38.countAndSay(5));
        System.out.println(question38.countAndSay(3));
    }
}
