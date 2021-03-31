package com.lh.learning.leetcode.no51_60.no56;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/3
 * @description:
 */
public class Question56Test {
    private static Question56 question56;

    @BeforeClass
    public static void beforeClass() {
        question56 = new Question56();
    }

    @Test
    public void test() {
        int[][] result1 = question56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println(JSON.toJSONString(result1));
        int[][] result2 = question56.merge(new int[][]{{1, 4}, {0, 0}});
        System.out.println(JSON.toJSONString(result2));
    }
}
