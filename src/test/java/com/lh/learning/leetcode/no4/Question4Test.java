package com.lh.learning.leetcode.no4;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by loneyfall on 2019/5/24.
 */
public class Question4Test {

    private static Question4 question4;

    @BeforeClass
    public static void beforeClass() {
        question4 = new Question4();
    }

    @Test
    public void test() {
        Assert.assertEquals(question4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0d, 0.001d);
    }
}
