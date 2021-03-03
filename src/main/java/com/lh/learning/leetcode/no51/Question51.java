package com.lh.learning.leetcode.no51;

import java.util.ArrayList;
import java.util.List;

/**
 * 初始化：0
 * 选择：1
 *
 * @auther: loneyfall
 * @date: 2021/2/25
 * @description: N 皇后
 */
public class Question51 {
    public List<List<String>> solveNQueens(int n) {
        int[][] solve = new int[n][n];
        List<List<String>> result = new ArrayList<List<String>>();
        searchSolveNQueens(solve, result, 0);
        return result;
    }

    private void searchSolveNQueens(int[][] solve, List<List<String>> result, int index) {
        if (index < 0 || index >= solve.length) {
            return;
        }
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
                    List<String> answer = new ArrayList<String>();
                    for (int x = 0; x < solve.length; x++) {
                        StringBuffer sb = new StringBuffer();
                        for (int y = 0; y < solve.length; y++) {
                            if (solve[x][y] == 1) {
                                sb.append("Q");
                            } else {
                                sb.append(".");
                            }
                        }
                        answer.add(sb.toString());
                    }
                    result.add(answer);
                } else {
                    searchSolveNQueens(solve, result, index + 1);
                }
                solve[index][i] = 0;
            }
        }
    }
}
