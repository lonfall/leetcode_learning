package com.lh.learning.leetcode.no9;

/**
 * @auther: loneyfall
 * @date: 2019/8/5
 * @description: 回文数
 */
public class Question9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        boolean result = true;
        int length = 0;
        long t = 1;
        while (x / t > 0) {
            length++;
            t *= 10;
        }
        for (int i = 0; i < length / 2; i++) {
            long m = 1;
            for (int a = 0; a < length - (i + 1); a++) {
                m *= 10;
            }
            long n = 1;
            for (int b = 0; b < i; b++) {
                n *= 10;
            }
            if (x / m % 10 == x / n % 10) {

            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
