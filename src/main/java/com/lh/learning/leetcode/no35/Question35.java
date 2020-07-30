package com.lh.learning.leetcode.no35;

/**
 * @auther: loneyfall
 * @date: 2020/7/30
 * @description: 搜索插入位置
 */
public class Question35 {
    public int searchInsert(int[] nums, int target) {
        int m = 0, n = nums.length - 1;
        int result = m;
        while (m <= n) {
            int mind = m + (n - m) / 2;
            if (nums[mind] == target) {
                result = mind;
                break;
            }
            if (nums[mind] < target) {
                result = mind + 1;
                m = mind + 1;
            } else {
                result = mind;
                n = mind - 1;
            }
        }
        return result;
    }
}
