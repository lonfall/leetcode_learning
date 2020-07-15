package com.lh.learning.leetcode.no21_30.no26;

/**
 * @auther: loneyfall
 * @date: 2020/7/8
 * @description: 删除排序数组中的重复项
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
