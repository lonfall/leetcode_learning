package com.lh.learning.leetcode.no41_50.no41;

/**
 * @auther: loneyfall
 * @date: 2020/11/18
 * @description: 缺失的第一个正数
 */
public class Question41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            findPositionAndExchange(nums, i);
        }
        int i = 0;
        for (; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                return i + 1;
            }
        }
        return i + 1;
    }

    private void findPositionAndExchange(int[] nums, int i) {
        if (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
            int t = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = t;
            findPositionAndExchange(nums, i);
        }
    }
}
