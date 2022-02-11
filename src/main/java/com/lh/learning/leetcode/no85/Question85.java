package com.lh.learning.leetcode.no85;

/**
 * @auther: loneyfall
 * @date: 2022/2/10
 * @description: 最大矩形
 */
public class Question85 {
    public int maximalRectangle(char[][] matrix) {
        if (null == matrix || matrix.length == 0) {
            return 0;
        }
        int max = 0;
        int[] heights = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (0 == heights[j]) {
                    int m = i;
                    while (m < matrix.length && matrix[m][j] == '1') {
                        m++;
                        heights[j]++;
                    }
                } else {
                    heights[j]--;
                }
            }
            int area = largestRectangleArea(heights);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    private int largestRectangleArea(int[] heights) {
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
