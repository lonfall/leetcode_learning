package com.lh.learning.leetcode.no59;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description: 螺旋矩阵 II
 */
public class Question59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        // 0右 1下 2左 3上
        int direction = 0;
        int i = 0, j = 0;
        w1:
        while (true) {
            result[i][j] = count;
            count++;
            switch (direction) {
                case 0:
                    if (j + 1 >= n || result[i][j + 1] > 0) {
                        if (i + 1 >= n || result[i + 1][j] > 0) {
                            break w1;
                        }
                        direction = 1;
                        count--;
                        continue;
                    }
                    j++;
                    break;
                case 1:
                    if (i + 1 >= n || result[i + 1][j] > 0) {
                        if (j - 1 < 0 || result[i][j - 1] > 0) {
                            break w1;
                        }
                        direction = 2;
                        count--;
                        continue;
                    }
                    i++;
                    break;
                case 2:
                    if (j - 1 < 0 || result[i][j - 1] > 0) {
                        if (i - 1 >= n || result[i - 1][j] > 0) {
                            break w1;
                        }
                        direction = 3;
                        count--;
                        continue;
                    }
                    j--;
                    break;
                case 3:
                    if (i - 1 >= n || result[i - 1][j] > 0) {
                        if (j + 1 >= n || result[i][j + 1] > 0) {
                            break w1;
                        }
                        direction = 0;
                        count--;
                        continue;
                    }
                    i--;
                    break;
            }
        }
        return result;
    }
}
