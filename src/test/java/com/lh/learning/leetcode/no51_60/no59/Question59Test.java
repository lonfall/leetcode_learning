package com.lh.learning.leetcode.no51_60.no59;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description:
 */
public class Question59Test {
    private static Question59 question59;

    @BeforeClass
    public static void beforeClass() {
        question59 = new Question59();
    }

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(question59.generateMatrix(20)));
    }
}
