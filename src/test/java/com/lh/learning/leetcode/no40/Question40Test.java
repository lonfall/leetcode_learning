package com.lh.learning.leetcode.no40;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2020/10/15
 * @description:
 */
public class Question40Test {
    private static Question40 question40;

    @BeforeClass
    public static void beforeClass() {
        question40 = new Question40();
    }

    @Test
    public void test() {
        int[] a1 = new int[]{10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> r1 = question40.combinationSum2(a1, 8);
        System.out.println(r1);

        int[] a2 = new int[]{2, 5, 2, 1, 2};
        List<List<Integer>> r2 = question40.combinationSum2(a2, 5);
        System.out.println(r2);
    }
}
