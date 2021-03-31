package com.lh.learning.leetcode.no51_60.no60;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description:
 */
public class Question60Test {
    private static Question60 question60;

    @BeforeClass
    public static void beforeClass() {
        question60 = new Question60();
    }

    @Test
    public void test() {
        System.out.println(question60.getPermutation(3, 3));
        System.out.println(question60.getPermutation(4, 9));
        System.out.println(question60.getPermutation(3, 1));
        System.out.println(question60.getPermutation(3, 2));
    }
}
