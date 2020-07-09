package com.lh.learning.leetcode.no27;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/9
 * @description:
 */
public class Question27Test {
    private static Question27 question27;

    @BeforeClass
    public static void beforeClass() {
        question27 = new Question27();
    }

    @Test
    public void test() {
        int[] nums = new int[]{3, 2, 2, 2, 2, 2, 2, 2, 2};
        int size = question27.removeElement(nums, 2);
        System.out.println(size);
    }
}
