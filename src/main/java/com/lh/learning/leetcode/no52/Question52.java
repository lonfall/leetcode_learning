package com.lh.learning.leetcode.no52;

/**
 * 与上一题思路一致，返回值更加简单
 * 在每一次回溯时对答案进行累加返回
 *
 * @auther: loneyfall
 * @date: 2021/2/27
 * @description:
 */
public class Question52 {
    public int totalNQueens(int n) {
        int[][] solve = new int[n][n];
        return searchSolveNQueens(solve, 0);
    }

    private int searchSolveNQueens(int[][] solve, int index) {
        if (index < 0 || index >= solve.length) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < solve.length; i++) {
            if (solve[index][i] == 0) {
                boolean flag = false;
                // 扫描冲突
                int len = index - 1, left = i - 1, right = i + 1;
                while (len >= 0) {
                    if (solve[len][i] == 1) {
                        flag = true;
                        break;
                    }
                    if (left >= 0 && solve[len][left] == 1) {
                        flag = true;
                        break;
                    }
                    if (right < solve.length && solve[len][right] == 1) {
                        flag = true;
                        break;
                    }
                    left--;
                    right++;
                    len--;
                }
                // 如果冲突则继续向后扫描
                if (flag) {
                    continue;
                }
                solve[index][i] = 1;
                if (index == solve.length - 1) {
                    count += 1;
                } else {
                    count += searchSolveNQueens(solve, index + 1);
                }
                solve[index][i] = 0;
            }
        }
        return count;
    }
}
