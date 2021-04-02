package com.lh.learning.leetcode.no62;

/**
 * @auther: loneyfall
 * @date: 2021/4/2
 * @description: 不同路径
 */
public class Question62 {
    public int uniquePaths(int m, int n) {
        int[][] table = new int[m][n];
        table[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0) {
                    table[i][j] += table[i - 1][j];
                }
                if (j - 1 >= 0) {
                    table[i][j] += table[i][j - 1];
                }
            }
        }
        return table[m - 1][n - 1];
    }

}
