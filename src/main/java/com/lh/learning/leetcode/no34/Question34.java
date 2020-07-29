package com.lh.learning.leetcode.no34;

/**
 * @auther: loneyfall
 * @date: 2020/7/29
 * @description: 在排序数组中查找元素的第一个和最后一个位置
 */
public class Question34 {
    public int[] searchRange(int[] nums, int target) {
        int m = 0, n = nums.length - 1;
        int find = -1;
        while (m <= n) {
            int mind = m + (n - m) / 2;
            if (nums[mind] == target) {
                find = mind;
                break;
            }
            if (nums[mind] > target) {
                n = mind - 1;
            } else {
                m = mind + 1;
            }
        }
        if (find == -1) {
            return new int[]{-1, -1};
        }
        int[] result = new int[]{find, find};
        while (m < result[0]) {
            int mind = m + (result[0] - m) / 2;
            if (nums[mind] == target) {
                result[0] = mind;
            } else {
                m = mind + 1;
            }
        }
        while (result[1] < n) {
            int mind = result[1] + (n - result[1]) / 2 + 1;
            if (nums[mind] == target) {
                result[1] = mind;
            } else {
                n = mind - 1;
            }
        }
        return result;
    }
}
