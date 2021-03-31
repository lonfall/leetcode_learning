package com.lh.learning.leetcode.no51_60.no54;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/2
 * @description:
 */
public class Question54Test {
    private static Question54 question54;

    @BeforeClass
    public static void beforeClass() {
        question54 = new Question54();
    }

    @Test
    public void test() {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(question54.spiralOrder(matrix1));
        int[][] matrix2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(question54.spiralOrder(matrix2));
    }
}
