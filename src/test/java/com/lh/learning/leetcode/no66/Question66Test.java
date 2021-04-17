package com.lh.learning.leetcode.no66;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/17
 * @description:
 */
public class Question66Test {
    private static Question66 question66;

    @BeforeClass
    public static void beforeClass() {
        question66 = new Question66();
    }

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(question66.plusOne(new int[]{9, 9, 9})));
        System.out.println(JSON.toJSONString(question66.plusOne(new int[]{1, 2, 3})));
        System.out.println(JSON.toJSONString(question66.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(JSON.toJSONString(question66.plusOne(new int[]{0})));
    }
}
