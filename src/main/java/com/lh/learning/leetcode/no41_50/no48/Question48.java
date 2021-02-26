package com.lh.learning.leetcode.no41_50.no48;

/**
 * @auther: loneyfall
 * @date: 2021/1/21
 * @description: 旋转图像
 */
public class Question48 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int layer = length / 2;
        for (int l = 0; l < layer; l++) {
            for (int ring = l; ring < length - l - 1; ring++) {
                int i = l, j = ring;
                int t = matrix[i][j];
                for (int count = 0; count < 4; count++) {
                    int tt = matrix[j][length - i - 1];
                    matrix[j][length - i - 1] = t;
                    t = tt;

                    int ttt = j;
                    j = length - i - 1;
                    i = ttt;
                }
            }
        }
    }
}
