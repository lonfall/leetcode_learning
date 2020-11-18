package com.lh.learning.leetcode.no31_40.no33;

/**
 * @auther: loneyfall
 * @date: 2020/7/29
 * @description: 搜索旋转排序数组
 */
public class Question33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        if (nums[0] == target) {
            return 0;
        }
        int m = 0, n = nums.length - 1;
        while (m <= n) {
            int mind = m + (n - m) / 2;
            if (nums[mind] == target) {
                return mind;
            }
            if (nums[mind] > target) {
                if (nums[n] >= target && nums[n] < nums[mind]) {
//                    right
                    m = mind + 1;
                } else {
//                    left
                    n = mind - 1;
                }
            } else {
                if (nums[m] <= target && nums[m] > nums[mind]) {
//                    left
                    n = mind - 1;
                } else {
//                    right
                    m = mind + 1;
                }
            }
        }
        return -1;
    }
}
