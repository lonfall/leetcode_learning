package com.lh.learning.leetcode.no11_20.no17;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2019/12/19
 * @description:
 */
public class Question17Test {

    private static Question17 question17;

    @BeforeClass
    public static void beforeClass() {
        question17 = new Question17();
    }

    @Test
    public void test() {
        //"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
        System.out.println(question17.letterCombinations("23456789"));
    }
}
