package com.lh.learning.leetcode.no84;

/**
 * todo 时间复杂度较高
 *
 * @auther: loneyfall
 * @date: 2022/2/9
 * @description: 柱状图中最大的矩形
 */
public class Question84 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int low;
        int index = 0;
        int max = 0;
        while (index < len) {
            low = heights[index];
            for (int i = index; i < len; i++) {
                if (heights[i] < low) {
                    low = heights[i];
                }
                if ((len - index + 1) * low < max) {
                    break;
                }
                int area = (i - index + 1) * low;
                if (area > max) {
                    max = area;
                }
            }
            index++;
        }
        return max;
    }
}
