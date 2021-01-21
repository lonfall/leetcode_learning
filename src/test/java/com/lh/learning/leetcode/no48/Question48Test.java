package com.lh.learning.leetcode.no48;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/1/21
 * @description:
 */
public class Question48Test {
    private static Question48 question48;

    @BeforeClass
    public static void beforeClass() {
        question48 = new Question48();
    }

    @Test
    public void test() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        question48.rotate(matrix);
        System.out.println(JSON.toJSONString(matrix));

        int[][] matrix2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        question48.rotate(matrix2);
        System.out.println(JSON.toJSONString(matrix2));
    }
}
