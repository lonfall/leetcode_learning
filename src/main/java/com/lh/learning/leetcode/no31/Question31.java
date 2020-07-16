package com.lh.learning.leetcode.no31;

/**
 * @auther: loneyfall
 * @date: 2020/7/15
 * @description: 下一个排列
 */
public class Question31 {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int prev = nums[nums.length - 1];
        boolean find = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < prev) {
                boolean index_find = false;
                for (int j = i; j < nums.length; j++) {
                    if (!index_find && (j + 1 == nums.length || nums[j + 1] <= nums[i])) {
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        index_find = true;
                    }
                    if (j + 1 == nums.length) {
                        reversal(nums, i + 1, nums.length - 1);
                    }
                }
                find = true;
                break;
            }
            prev = nums[i];
        }
        if (!find) {
            reversal(nums, 0, nums.length - 1);
        }
    }

    public void reversal(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
