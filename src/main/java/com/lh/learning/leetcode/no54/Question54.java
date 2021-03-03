package com.lh.learning.leetcode.no54;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环顺序：右-》下-》左-》上
 *
 * @auther: loneyfall
 * @date: 2021/3/2
 * @description: 螺旋矩阵
 */
public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        Direction direction = Direction.RIGHT;
        do {
            if (check(matrix, i, j, m, n)) {
                result.add(matrix[i][j]);
                matrix[i][j] = Integer.MAX_VALUE;
            } else {
                break;
            }
            if (direction == Direction.UP) {
                if (check(matrix, i - 1, j, m, n)) {
                    i--;
                } else {
                    direction = Direction.RIGHT;
                    j++;
                }
            } else if (direction == Direction.RIGHT) {
                if (check(matrix, i, j + 1, m, n)) {
                    j++;
                } else {
                    direction = Direction.DOWN;
                    i++;
                }
            } else if (direction == Direction.DOWN) {
                if (check(matrix, i + 1, j, m, n)) {
                    i++;
                } else {
                    direction = Direction.LEFT;
                    j--;
                }
            } else if (direction == Direction.LEFT) {
                if (check(matrix, i, j - 1, m, n)) {
                    j--;
                } else {
                    direction = Direction.UP;
                    i--;
                }
            }
        } while (true);

        return result;
    }

    private boolean check(int[][] matrix, int i, int j, int m, int n) {
        if (i >= 0 && i < m && j >= 0 && j < n && matrix[i][j] != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private enum Direction {
        UP, RIGHT, DOWN, LEFT;
    }
}
