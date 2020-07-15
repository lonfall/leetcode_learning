package com.lh.learning.leetcode.no21_30.no28;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/10
 * @description:
 */
public class Question28Test {
    private static Question28 question28;

    @BeforeClass
    public static void beforeClass() {
        question28 = new Question28();
    }

    @Test
    public void test() {
        System.out.println(question28.strStr("aaaaa", "bba"));
    }
}
