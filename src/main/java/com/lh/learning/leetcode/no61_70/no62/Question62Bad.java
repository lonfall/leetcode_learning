package com.lh.learning.leetcode.no61_70.no62;

/**
 * 时间效率低（时间复杂图成指数级上升）
 *
 * @auther: loneyfall
 * @date: 2021/4/2
 * @description: 不同路径
 */
public class Question62Bad {
    public int uniquePaths(int m, int n) {
        int[][] table = new int[m][n];
        walk(table, 0, 0, m, n);
        return table[m - 1][n - 1];
    }

    private void walk(int[][] table, int i, int j, int m, int n) {
        table[i][j]++;
        if (i < m - 1) {
            walk(table, i + 1, j, m, n);
        }
        if (j < n - 1) {
            walk(table, i, j + 1, m, n);
        }
    }
}
