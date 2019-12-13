package com.lh.learning.leetcode.no11;

/**
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description:
 */
public class Question11 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_area = 0;
        while (i < j) {
            int a = height[i];
            int b = height[j];
            int area = (j - i) * min(a, b);
            if (area > max_area) {
                max_area = area;
            }
            if (a == b) {
                i++;
                j--;
            } else if (a > b) {
                j--;
            } else {
                i++;
            }
        }
        return max_area;
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }
}
