package com.lh.learning.leetcode.no80;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/9/13
 * @description:
 */
public class Question80Test {
    private static Question80 question80;

    @BeforeClass
    public static void beforeClass() {
        question80 = new Question80();
    }

    @Test
    public void test() {
        int[] target = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(question80.removeDuplicates(target));
        System.out.println(JSON.toJSONString(target));

        int[] target2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(question80.removeDuplicates(target2));
        System.out.println(JSON.toJSONString(target2));

        int[] target3 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 6, 9, 9, 9, 10};
        System.out.println(question80.removeDuplicates(target3));
        System.out.println(JSON.toJSONString(target3));
    }
}
