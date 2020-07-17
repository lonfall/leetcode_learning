package com.lh.learning.leetcode.no32;

/**
 * 时间复杂度 n*log n
 * 空间复杂度 n
 *
 * @auther: loneyfall
 * @date: 2020/7/17
 * @description: 最长有效括号
 */
public class Question32 {
    public int longestValidParentheses(String s) {
        int[] temp = new int[s.length()];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            temp[i] = charVal(s, i);
            if (temp[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                temp[j] = temp[j - 1] + charVal(s, j);
                if (temp[j] == 0) {
                    if (temp[j - 1] > 0) {
                        int t = j - i + 1;
                        if (max < t) {
                            max = t;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return max;
    }

    private int charVal(String s, int index) {
        if (s.charAt(index) == '(') {
            return 1;
        } else {
            return -1;
        }
    }
}
