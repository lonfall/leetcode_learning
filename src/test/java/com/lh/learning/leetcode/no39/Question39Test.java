package com.lh.learning.leetcode.no39;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2020/10/15
 * @description:
 */
public class Question39Test {
    private static Question39 question39;

    @BeforeClass
    public static void beforeClass() {
        question39 = new Question39();
    }

    @Test
    public void test() {
        int[] a1 = new int[]{2, 3, 6, 7};
        List<List<Integer>> r1 = question39.combinationSum(a1, 7);
        System.out.println(r1);
        int[] a2 = new int[]{2, 3, 5};
        List<List<Integer>> r2 = question39.combinationSum(a2, 8);
        System.out.println(r2);

//        int[] a3 = new int[]{2, 7, 6, 3, 5, 1};
//        List<List<Integer>> r3 = question39.combinationSum(a3, 9);
//        System.out.println(r3);
    }
}
