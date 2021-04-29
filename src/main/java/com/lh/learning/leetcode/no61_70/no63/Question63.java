package com.lh.learning.leetcode.no61_70.no63;

/**
 * @auther: loneyfall
 * @date: 2021/4/7
 * @description:
 */
public class Question63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[obstacleGrid.length - 1].length - 1] == 1) {
            return 0;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        obstacleGrid[0][0] = 1;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] < 0) {
                    continue;
                }
                if (i - 1 >= 0 && obstacleGrid[i - 1][j] > 0) {
                    obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] > 0) {
                    obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                }
            }
        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[obstacleGrid.length - 1].length - 1];
    }
}
