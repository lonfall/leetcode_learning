package com.lh.learning.leetcode.no53;

/**
 * @auther: loneyfall
 * @date: 2021/2/27
 * @description: 最大子序和
 */
public class Question53 {
    public int maxSubArray(int[] nums) {
        return maxSubArrayIndex(nums, 0);
    }

    private int maxSubArrayIndex(int[] nums, int start) {
        int max = nums[start], count = nums[start], max_i = start;
        for (int i = start + 1; i < nums.length; i++) {
            count += nums[i];
            if (max <= count) {
                max = count;
                max_i = i;
            }
        }
        count = max;
        for (int i = start; i < max_i; i++) {
            count -= nums[i];
            if (max < count) {
                max = count;
            }
        }

        if (max_i + 1 < nums.length) {
            count = maxSubArrayIndex(nums, max_i + 1);
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
