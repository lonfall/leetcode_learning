package com.lh.learning.leetcode.no55;

/**
 * @auther: loneyfall
 * @date: 2021/3/3
 * @description:
 */
public class Question55 {
    public boolean canJump(int[] nums) {
        int index = 0, max = 0;
        while (index < nums.length) {
            if (index == nums.length - 1) {
                return true;
            }
            if (index == max && nums[index] == 0) {
                return false;
            }
            max = Math.max(index + nums[index], max);
            index++;
        }
        return true;
    }
}