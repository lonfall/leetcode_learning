package com.lh.learning.leetcode.no65;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/4/8
 * @description:
 */
public class Question65Test {
    private static Question65 question65;

    @BeforeClass
    public static void beforeClass() {
        question65 = new Question65();
    }

    @Test
    public void test() {
        Assert.assertTrue(question65.isNumber(".1"));
        Assert.assertTrue(question65.isNumber("0"));
        Assert.assertFalse(question65.isNumber("e"));
        Assert.assertFalse(question65.isNumber("."));
        Assert.assertFalse(question65.isNumber("0e"));
    }
}
