package com.lh.learning.leetcode.no71_80.no72;

/**
 * @auther: loneyfall
 * @date: 2021/5/14
 * @description: 编辑距离
 */
public class Question72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        dp[0][0] = 0;
        for (int i = 1; i < word1.length() + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < word2.length() + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < word1.length() + 1; i++) {
            for (int j = 1; j < word2.length() + 1; j++) {
                dp[i][j] = dp[i - 1][j - 1] + (word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1);
                if (dp[i - 1][j] + 1 < dp[i][j]) {
                    dp[i][j] = dp[i - 1][j] + 1;
                }
                if (dp[i][j - 1] + 1 < dp[i][j]) {
                    dp[i][j] = dp[i][j - 1] + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
