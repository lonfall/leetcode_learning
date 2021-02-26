package com.lh.learning.leetcode.no41_50.no47;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description:
 */
public class Question47Test {
    private static Question47 question47;

    @BeforeClass
    public static void beforeClass() {
        question47 = new Question47();
    }

    @Test
    public void test() {
        List<List<Integer>> result = question47.permuteUnique(new int[]{1, 2, 3});
        System.out.println(result);
        List<List<Integer>> result2 = question47.permuteUnique(new int[]{1, 1, 2});
        System.out.println(result2);
    }
}
