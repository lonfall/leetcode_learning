package com.lh.learning.leetcode.no11;

/**
 * 双指针法，从最大长度即数组最前与最后开始
 * 每次舍弃较短值向内移动指针，直到指针相遇
 * 每次计算面积，更新最大值
 *
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description: 盛最多水的容器
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
