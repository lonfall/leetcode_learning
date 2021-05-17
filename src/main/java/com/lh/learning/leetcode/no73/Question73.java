package com.lh.learning.leetcode.no73;

/**
 * @auther: loneyfall
 * @date: 2021/5/14
 * @description: 矩阵置零
 */
public class Question73 {
    public void setZeroes(int[][] matrix) {
        boolean ci = false, cy = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                ci = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                cy = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int x = 1; x < matrix[0].length; x++) {
                    matrix[i][x] = 0;
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int x = 1; x < matrix.length; x++) {
                    matrix[x][i] = 0;
                }
            }
        }

        if (ci) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (cy) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
