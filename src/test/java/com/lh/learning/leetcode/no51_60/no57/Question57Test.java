package com.lh.learning.leetcode.no51_60.no57;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/4
 * @description:
 */
public class Question57Test {
    private static Question57 question57;

    @BeforeClass
    public static void beforeClass() {
        question57 = new Question57();
    }

    @Test
    public void test() {
        int[][] result1 = question57.insert(new int[][]{{1, 2}, {6, 9}}, new int[]{2, 5});
        System.out.println(JSON.toJSONString(result1));
//        {1,2},{3,5},{6,7},{8,10},{12,16}        {4,8}
        int[][] result2 = question57.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        System.out.println(JSON.toJSONString(result2));
        int[][] result3 = question57.insert(new int[][]{}, new int[]{5, 7});
        System.out.println(JSON.toJSONString(result3));
        int[][] result4 = question57.insert(new int[][]{{1, 5}}, new int[]{2, 3});
        System.out.println(JSON.toJSONString(result4));
        int[][] result5 = question57.insert(new int[][]{{1, 5}}, new int[]{2, 7});
        System.out.println(JSON.toJSONString(result5));
    }
}
