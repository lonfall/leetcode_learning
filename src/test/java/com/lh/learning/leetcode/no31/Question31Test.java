package com.lh.learning.leetcode.no31;

import com.alibaba.fastjson.JSON;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/15
 * @description:
 */
public class Question31Test {
    private static Question31 question31;

    @BeforeClass
    public static void beforeClass() {
        question31 = new Question31();
    }

    @Test
    public void test() {
        int[] array1 = new int[]{1, 2, 3};
        question31.nextPermutation(array1);
        System.out.println(JSON.toJSON(array1));

        int[] array2 = new int[]{1, 1, 5};
        question31.nextPermutation(array2);
        System.out.println(JSON.toJSON(array2));

        int[] array3 = new int[]{3, 2, 1};
        question31.nextPermutation(array3);
        System.out.println(JSON.toJSON(array3));

        int[] array4 = new int[]{1, 3, 2};
        question31.nextPermutation(array4);
        System.out.println(JSON.toJSON(array4));

        int[] array5 = new int[]{2, 3, 1};
        question31.nextPermutation(array5);
        System.out.println(JSON.toJSON(array5));

        //[4,1,2,3,5]
        int[] array6 = new int[]{3, 5, 4, 2, 1};
        question31.nextPermutation(array6);
        System.out.println(JSON.toJSON(array6));
    }
}
