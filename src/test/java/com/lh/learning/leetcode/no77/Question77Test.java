package com.lh.learning.leetcode.no77;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/8/26
 * @description:
 */
public class Question77Test {
    private static Question77 question77;

    @BeforeClass
    public static void beforeClass() {
        question77 = new Question77();
    }

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(question77.combine(4, 2)));
        System.out.println(JSON.toJSONString(question77.combine(1, 1)));
    }
}
