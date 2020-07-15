package com.lh.learning.leetcode.no21_30.no29;

/**
 * TODO 边界问题未解决负数在接近最小值时往左移会变得不像预期的一样
 *
 * @auther: loneyfall
 * @date: 2020/7/13
 * @description: 两数相除
 */
public class Question29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int num = -1;
        boolean negative = false;
        if (dividend > 0) {
            dividend = -dividend;
            negative = !negative;
        }
        if (divisor > 0) {
            divisor = -divisor;
            negative = !negative;
        }
        if (dividend > divisor) {
            return 0;
        }
        int t = divisor;
        while (dividend < divisor) {
            divisor = divisor << 1;
            num = num << 1;
        }
        if (dividend == divisor) {
            return negative ? num : -num;
        }
        if (dividend - (divisor >> 1) > t) {
            return negative ? num >> 1 : -(num >> 1);
        } else {
            num = (num >> 1) - divide(dividend - (divisor >> 1), t);
            return negative ? num : -num;
        }
    }
}
