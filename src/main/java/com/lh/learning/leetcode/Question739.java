package com.lh.learning.leetcode;

/**
 * @auther: loneyfall
 * @date: 2020/6/23
 * @description:
 */
public class Question739 {
    public int[] tempForecast(int[] temps) {
        int[] result = new int[temps.length];
        for (int i = 1; i < temps.length; i++) {
            for (int j = 0; j < i; j++) {
                if (result[j] == 0 && temps[j] < temps[i]) {
                    result[j] = i - j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new Question739().tempForecast(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(result);
    }
}
