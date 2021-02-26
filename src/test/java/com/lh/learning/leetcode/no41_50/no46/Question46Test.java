package com.lh.learning.leetcode.no41_50.no46;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description:
 */
public class Question46Test {
    private static Question46 question46;

    @BeforeClass
    public static void beforeClass() {
        question46 = new Question46();
    }

    @Test
    public void test() {
        List<List<Integer>> result = question46.permute(new int[]{1, 2, 3});
        System.out.println(result);
        List<List<Integer>> result2 = question46.permute(new int[]{1, 2});
        System.out.println(result2);
        List<List<Integer>> result3 = question46.permute(new int[]{1});
        System.out.println(result3);
        List<List<Integer>> result4 = question46.permute(new int[]{});
        System.out.println(result4);
        List<List<Integer>> result5 = question46.permute(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(result5);
    }
}
