package com.lh.learning.leetcode.no64;

/**
 * @auther: loneyfall
 * @date: 2021/4/8
 * @description:
 */
public class Question64 {
    public int minPathSum(int[][] grid) {
        int[] tmp = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int t = 0;
                if (i > 0) {
                    if (j > 0) {
                        t = Math.min(tmp[j], tmp[j - 1]);
                    } else {
                        t = tmp[j];
                    }
                } else {
                    if (j > 0) {
                        t = tmp[j - 1];
                    }
                }
                tmp[j] = t + grid[i][j];
            }
        }
        return tmp[tmp.length - 1];
    }
}
