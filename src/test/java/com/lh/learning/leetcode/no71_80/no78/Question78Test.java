package com.lh.learning.leetcode.no71_80.no78;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/9/9
 * @description:
 */
public class Question78Test {
    private static Question78 question78;

    @BeforeClass
    public static void beforeClass() {
        question78 = new Question78();
    }

    @Test
    public void test() {
        List<List<Integer>> result1 = question78.subsets(new int[]{1, 2, 3, 4});
        System.out.println(JSON.toJSONString(result1));
        List<List<Integer>> result2 = question78.subsets(new int[]{0});
        System.out.println(JSON.toJSONString(result2));
    }
}
