package com.lh.learning.leetcode.no61_70.no69;

/**
 * @auther: loneyfall
 * @date: 2021/4/23
 * @description: x 的平方根
 */
public class Question69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        if (x > 46340 * 46340) {
            return 46340;
        }
        int t1 = 2, t2 = 46340;
        while (true) {
            if (t2 * t2 == x) {
                return t2;
            } else if (t2 - t1 < 2) {
                break;
            }
            int t = t1 + ((t2 - t1) / 2);
            if (t * t < x) {
                t1 = t;
            } else {
                t2 = t;
            }
        }
        return t1;
    }
}
