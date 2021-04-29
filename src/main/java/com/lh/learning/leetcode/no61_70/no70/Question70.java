package com.lh.learning.leetcode.no61_70.no70;

/**
 * @auther: loneyfall
 * @date: 2021/4/23
 * @description: 爬楼梯
 */
public class Question70 {

    public int climbStairs(int n) {
        int[] stairs = new int[n];
        if (n < 2) {
            return 1;
        }
        stairs[0] = 1;
        stairs[1] = 2;
        for (int i = 2; i < n; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        return stairs[n - 1];
    }
}
