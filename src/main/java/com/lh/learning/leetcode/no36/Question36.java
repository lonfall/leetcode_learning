package com.lh.learning.leetcode.no36;

/**
 * @auther: loneyfall
 * @date: 2020/7/30
 * @description: 有效的数独
 */
public class Question36 {
    public boolean isValidSudoku(char[][] board) {
        int[] item = new int[]{0, 1 << 0, 1 << 1, 1 << 2, 1 << 3, 1 << 4, 1 << 5, 1 << 6, 1 << 7, 1 << 8};
        for (int i = 0; i < 9; i++) {
            int t1 = 0, t2 = 0;
            for (int j = 0; j < 9; j++) {
                int n1 = board[i][j] - '0', n2 = board[j][i] - '0';
                if (board[i][j] == '.') {
                    n1 = 0;
                }
                if (board[j][i] == '.') {
                    n2 = 0;
                }
                if ((item[n1] & t1) > 0 || (item[n2] & t2) > 0) {
                    return false;
                }
                t1 = t1 | item[n1];
                t2 = t2 | item[n2];
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int t = 0;
                for (int i = x * 3; i < (x + 1) * 3; i++) {
                    for (int j = y * 3; j < (y + 1) * 3; j++) {
                        int n = board[i][j] - '0';
                        if (board[i][j] == '.') {
                            n = 0;
                        }
                        if ((item[n] & t) > 0) {
                            return false;
                        }
                        t = t | item[n];
                    }
                }
            }
        }
        return true;
    }
}
