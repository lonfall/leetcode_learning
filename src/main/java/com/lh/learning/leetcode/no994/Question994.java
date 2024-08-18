package com.lh.learning.leetcode.no994;

public class Question994 {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (boolean flag = false; !flag; ) {
            flag = true;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 2) {
                        if (rotting(grid, i - 1, j)) {
                            flag = false;
                        }
                        if (rotting(grid, i + 1, j)) {
                            flag = false;
                        }
                        if (rotting(grid, i, j - 1)) {
                            flag = false;
                        }
                        if (rotting(grid, i, j + 1)) {
                            flag = false;
                        }
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 3) {
                        grid[i][j] = 2;
                    }
                }
            }
            if (!flag) {
                result++;
            }
        }

        to:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    result = -1;
                    break to;
                }
            }
        }
        return result;
    }

    private boolean rotting(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (0 <= i && i < m && 0 <= j && j < n && grid[i][j] == 1) {
            grid[i][j] = 3;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Question994 question = new Question994();
//        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
//        int[][] grid = new int[][]{{0, 2}};
        System.out.println(question.orangesRotting(grid));
    }
}
