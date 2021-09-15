package com.lh.learning.leetcode.no71_80.no75;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/5/20
 * @description:
 */
public class Question75Test {
    private static Question75 question75;

    @BeforeClass
    public static void beforeClass() {
        question75 = new Question75();
    }

    @Test
    public void test() {
        int[] num1 = new int[]{2, 0, 2, 1, 1, 0, 1, 2, 0, 1, 2, 0, 2, 1, 0, 1, 0, 2, 0};
        question75.sortColors(num1);
        System.out.println(JSON.toJSONString(num1));

        int[] num2 = new int[]{2, 0, 2, 1, 1, 0};
        question75.sortColors(num2);
        System.out.println(JSON.toJSONString(num2));

        int[] num3 = new int[]{2, 0, 1};
        question75.sortColors(num3);
        System.out.println(JSON.toJSONString(num3));

        int[] num4 = new int[]{0};
        question75.sortColors(num4);
        System.out.println(JSON.toJSONString(num4));

        int[] num5 = new int[]{1};
        question75.sortColors(num5);
        System.out.println(JSON.toJSONString(num5));

        int[] num6 = new int[]{2};
        question75.sortColors(num6);
        System.out.println(JSON.toJSONString(num6));
    }
}
