package com.lh.learning.leetcode.no31_40.no34;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/29
 * @description:
 */
public class Question34Test {
    private static Question34 question34;

    @BeforeClass
    public static void beforeClass() {
        question34 = new Question34();
    }

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(question34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(JSON.toJSONString(question34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(JSON.toJSONString(question34.searchRange(new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 10}, 8)));
    }
}
