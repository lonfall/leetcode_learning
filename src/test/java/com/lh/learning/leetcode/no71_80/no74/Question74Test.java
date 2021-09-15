package com.lh.learning.leetcode.no71_80.no74;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/5/17
 * @description:
 */
public class Question74Test {
    private static Question74 question74;

    @BeforeClass
    public static void beforeClass() {
        question74 = new Question74();
    }

    @Test
    public void test() {
        int[][] matrix1 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(question74.searchMatrix(matrix1, 3));
        System.out.println(question74.searchMatrix(matrix1, 13));
        System.out.println(question74.searchMatrix(matrix1, 16));
        System.out.println(question74.searchMatrix(matrix1, 21));
        int[][] matrix2 = new int[][]{{1}};
        System.out.println(question74.searchMatrix(matrix2, 1));
        System.out.println(question74.searchMatrix(matrix2, 0));
    }
}
