package com.lh.learning.leetcode.no79;

/**
 * @auther: loneyfall
 * @date: 2021/9/9
 * @description: 单词搜索
 */
public class Question79 {
    public boolean exist(char[][] board, String word) {
        boolean[][] flags = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (find(i, j, board, flags, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean find(int i, int j, char[][] board, boolean[][] flags, String word, int index) {
        if (index == word.length() - 1) {
            return true;
        }
        flags[i][j] = true;
        int m = board.length;
        int n = board[0].length;
        if (j + 1 < n && board[i][j + 1] == word.charAt(index + 1) && !flags[i][j + 1]) {
            if (find(i, j + 1, board, flags, word, index + 1)) {
                flags[i][j] = false;
                return true;
            }
        }
        if (j - 1 >= 0 && board[i][j - 1] == word.charAt(index + 1) && !flags[i][j - 1]) {
            if (find(i, j - 1, board, flags, word, index + 1)) {
                flags[i][j] = false;
                return true;
            }
        }
        if (i - 1 >= 0 && board[i - 1][j] == word.charAt(index + 1) && !flags[i - 1][j]) {
            if (find(i - 1, j, board, flags, word, index + 1)) {
                flags[i][j] = false;
                return true;
            }
        }
        if (i + 1 < m && board[i + 1][j] == word.charAt(index + 1) && !flags[i + 1][j]) {
            if (find(i + 1, j, board, flags, word, index + 1)) {
                flags[i][j] = false;
                return true;
            }
        }
        flags[i][j] = false;
        return false;
    }
}
