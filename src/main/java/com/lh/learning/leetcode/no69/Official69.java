package com.lh.learning.leetcode.no69;

/**
 * 官方题解
 *
 * @auther: loneyfall
 * @date: 2021/4/23
 * @description: x 的平方根
 */
public class Official69 {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
