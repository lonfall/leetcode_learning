package com.lh.learning.leetcode.no41_50.no45;

/**
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description: 跳跃游戏 II
 */
public class Question45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else if (nums.length == 2) {
            return 1;
        }
        int index = 1;
        int prev_max = 0;
        int scan_max = 0;
        while (index < nums.length) {
            for (int i = index - 1; i <= prev_max; i++) {
                if ((i + nums[i]) > scan_max) {
                    scan_max = i + nums[i];
                }
                if (scan_max >= nums.length - 1) {
                    return index;
                }
            }
            prev_max = scan_max;
            index++;
        }
        return nums.length - 1;
    }
}
