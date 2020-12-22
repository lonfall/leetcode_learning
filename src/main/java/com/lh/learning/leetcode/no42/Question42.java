package com.lh.learning.leetcode.no42;

/**
 * @auther: loneyfall
 * @date: 2020/12/9
 * @description: 接雨水
 */
public class Question42 {
    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        int x = 0, y = 0, max = -1, result = 0;
        while (x < height.length - 1) {
            for (y++; y < height.length; y++) {
                if (height[y] >= height[x]) {
                    int count = 0;
                    for (int i = x + 1; i < y; i++) {
                        count += height[x] - height[i];
                    }
                    result += count;
                    x = y;
//                    y = x + 1;
                    max = -1;
                    continue;
                }
                if (max == -1 || height[max] < height[y]) {
                    max = y;
                }
            }
            if (x < height.length - 1) {
                int count = 0;
                for (int i = x + 1; i < max; i++) {
                    count += height[max] - height[i];
                }
                result += count;
                x = max;
                y = x;
                max = -1;
            }
        }
        return result;
    }
}
