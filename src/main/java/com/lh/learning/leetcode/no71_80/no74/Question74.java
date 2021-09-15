package com.lh.learning.leetcode.no71_80.no74;

/**
 * @auther: loneyfall
 * @date: 2021/5/17
 * @description:
 */
public class Question74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m;
        while (left < right) {
            int mid = (right + left) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int index = left == 0 ? 0 : left - 1;
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (matrix[index][mid] == target) {
                return true;
            } else if (matrix[index][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
