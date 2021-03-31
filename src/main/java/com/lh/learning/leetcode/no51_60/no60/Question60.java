package com.lh.learning.leetcode.no51_60.no60;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description: 排列序列
 */
public class Question60 {
    public String getPermutation(int n, int k) {
        int[] array = new int[n];
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        StringBuffer sb = new StringBuffer();
        getPermutation(sb, array, factorial, k, n);
        return sb.toString();
    }

    private void getPermutation(StringBuffer sb, int[] array, int factorial, int k, int n) {
        if (n < 1) {
            return;
        }
        int fc = factorial / n;
        int row = k % fc > 0 ? k / fc + 1 : k / fc;
        int next_k = k % fc > 0 ? k % fc : fc;
        for (int i = 0, j = 1; i < array.length; i++) {
            if (array[i] != 0) {
                continue;
            }
            if (j == row) {
                array[i] = i + 1;
                sb.append(array[i]);
                break;
            }
            j++;
        }
        getPermutation(sb, array, fc, next_k, n - 1);
    }
}
