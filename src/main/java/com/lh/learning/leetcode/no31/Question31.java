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
                int min = nums[i];
                int t = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (j + 1 >= nums.length || nums[j + 1] < min) {
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                    int temp = nums[j];
                    nums[j] = t;
                    t = temp;
                }
                find = true;
                break;
            }
            prev = nums[i];
        }
        if (find) {
            return;
        }
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
