package com.lh.learning.leetcode.no51_60.no55;

/**
 * @auther: loneyfall
 * @date: 2021/3/3
 * @description: 跳跃游戏
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
