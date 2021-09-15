package com.lh.learning.leetcode.no71_80.no73;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/5/14
 * @description:
 */
public class Question73Test {
    private static Question73 question73;

    @BeforeClass
    public static void beforeClass() {
        question73 = new Question73();
    }

    @Test
    public void test() {
        int[][] matrix1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        question73.setZeroes(matrix1);
        System.out.println(JSON.toJSONString(matrix1));

        int[][] matrix2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        question73.setZeroes(matrix2);
        System.out.println(JSON.toJSONString(matrix2));
    }
}
