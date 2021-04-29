package com.lh.learning.leetcode.no61_70.no66;

/**
 * @auther: loneyfall
 * @date: 2021/4/17
 * @description: 加一
 */
public class Question66 {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry = digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (carry) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
