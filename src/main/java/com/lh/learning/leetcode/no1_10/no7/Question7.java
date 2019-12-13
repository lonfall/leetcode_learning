package com.lh.learning.leetcode.no1_10.no7;

/**
 * @auther: loneyfall
 * @date: 2019/5/29
 * @description: 整数反转
 */
public class Question7 {
    public int reverse(int x) {
        StringBuffer str = new StringBuffer();
        boolean neg = x < 0;
        if (neg) {
            str.append("-");
        }
        long div = 1;
        long rem = 10;
        while (x / div != 0) {
            int t = (int) (x % rem / div * (neg ? -1 : 1));
            str.append(t);
            div *= 10;
            rem *= 10;
        }
        try {
            return Integer.valueOf(str.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
