package com.lh.learning.leetcode.no37;

/**
 * @auther: loneyfall
 * @date: 2020/7/31
 * @description: 解数独
 */
public class Question37 {
    private static int[] item = new int[]{1 << 0, 1 << 1, 1 << 2, 1 << 3, 1 << 4, 1 << 5, 1 << 6, 1 << 7, 1 << 8};
    private static int max = 511;

    public void solveSudoku(char[][] board) {
        int[][] temp = new int[9][9];
        // 初始化行列
        for (int i = 0; i < 9; i++) {
            int t1 = 0, t2 = 0;
            for (int j = 0; j < 9; j++) {
                int n1 = board[i][j] - '1', n2 = board[j][i] - '1';
                if (board[i][j] != '.') {
                    temp[i][j] = max;
                    t1 = t1 | item[n1];
                }
                if (board[j][i] != '.') {
                    temp[j][i] = max;
                    t2 = t2 | item[n2];
                }
            }
            for (int j = 0; j < 9; j++) {
                if (temp[i][j] < max) {
                    temp[i][j] = temp[i][j] | t1;
                }
                if (temp[j][i] < max) {
                    temp[j][i] = temp[j][i] | t2;
                }
            }
        }
        // 初始化3X3格
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int t = 0;
                for (int i = x * 3; i < (x + 1) * 3; i++) {
                    for (int j = y * 3; j < (y + 1) * 3; j++) {
                        int n = board[i][j] - '1';
                        if (board[i][j] != '.') {
                            t = t | item[n];
                        }
                    }
                }
                for (int i = x * 3; i < (x + 1) * 3; i++) {
                    for (int j = y * 3; j < (y + 1) * 3; j++) {
                        if (temp[i][j] < max) {
                            temp[i][j] = temp[i][j] | t;
                        }
                    }
                }
            }
        }

        findNumber(board, temp);
        int[][] reverseTemp = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                reverseTemp[i][j] = max ^ temp[i][j];
            }
        }
        guessNumber(board, reverseTemp);
    }

    private void guessNumber(char[][] board, int[][] reverseTemp) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (reverseTemp[i][j] == 0) {
                    continue;
                }
                for (int m = 0; m < 9; m++) {
                    if ((reverseTemp[i][j] & item[m]) > 0) {
                        boolean success = guessNextNumber(board, new int[9][9], reverseTemp, m, i, j);
                        if (success) {
                            break;
                        } else {
                            board[i][j] = '.';
                        }
                    }
                }
                return;
            }
        }
    }

    private boolean guessNextNumber(char[][] board, int[][] temp, int[][] reverseTemp, int num, int i, int j) {
        if (!checkNumberForTemp(temp, num, i, j)) {
            return false;
        }
        temp[i][j] = num + 1;
        board[i][j] = (char) ('1' + num);
        j++;
        boolean success = false;
        home:
        for (; i < 9; i++) {
            for (; j < 9; j++) {
                if (reverseTemp[i][j] == 0) {
                    continue;
                }
                for (int m = 0; m < 9; m++) {
                    if ((reverseTemp[i][j] & item[m]) > 0) {
                        success = guessNextNumber(board, temp, reverseTemp, m, i, j);
                        if (success) {
                            break;
                        } else {
                            temp[i][j] = 0;
                            board[i][j] = '.';
                        }
                    }
                }
                break home;
            }
            if (i < 8 && j > 8) {
                j = 0;
            }
        }
        if (i > 8 && j > 8) {
            success = true;
        }
        return success;
    }

    private boolean checkNumberForTemp(int[][] temp, int num, int i, int j) {
        for (int m = 0; m < 9; m++) {
            if (temp[i][m] == num + 1) {
                return false;
            }
            if (temp[m][j] == num + 1) {
                return false;
            }
        }
        for (int m = (i / 3) * 3; m < ((i / 3) + 1) * 3; m++) {
            for (int n = (j / 3) * 3; n < ((j / 3) + 1) * 3; n++) {
                if (temp[m][n] == num + 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private void findNumber(char[][] board, int[][] temp) {
        int min_i = -1, min_j = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (temp[i][j] == max) {
                    continue;
                }
                if (min_i == -1) {
                    min_i = i;
                    min_j = j;
                }
                for (int m = 0; m < 9; m++) {
                    if ((temp[i][j] | item[m]) == max) {
                        board[i][j] = (char) ('1' + m);
                        temp[i][j] = max;
                        updateTemp(temp, m, i, j);
                        i = min_i;
                        j = min_j - 1;
                        min_i = -1;
                        min_j = -1;
                        break;
                    }
                }
            }
        }
    }

    private void updateTemp(int[][] temp, int number, int i, int j) {
        // 更新行列
        for (int m = 0; m < 9; m++) {
            if (temp[i][m] != max) {
                temp[i][m] = temp[i][m] | item[number];
            }
            if (temp[m][j] != max) {
                temp[m][j] = temp[m][j] | item[number];
            }
        }
        // 更新3X3格
        for (int m = (i / 3) * 3; m < ((i / 3) + 1) * 3; m++) {
            for (int n = (j / 3) * 3; n < ((j / 3) + 1) * 3; n++) {
                if (temp[m][n] != max) {
                    temp[m][n] = temp[m][n] | item[number];
                }
            }
        }
    }
}
