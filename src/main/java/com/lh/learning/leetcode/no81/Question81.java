package com.lh.learning.leetcode.no81;

/**
 * todo 这道题测试不通过，放着很久没思路了，先跳过吧
 *
 * @auther: loneyfall
 * @date: 2021/9/15
 * @description: 搜索旋转排序数组 II
 */
public class Question81 {
    public boolean search(int[] nums, int target) {
        int rotate = nums[0];
        if (target == rotate) {
            return true;
        }
        boolean left = target > rotate;

        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            if (min == max) {
                if (nums[min] == target) {
                    return true;
                } else {
                    return false;
                }
            }
            int midden = min + max / 2;
            if (nums[midden] == target) {
                return true;
            }
            if (left) {
                if (nums[midden] <= rotate || nums[midden] > target) {
                    max = midden - 1;
                } else {
                    min = midden + 1;
                }
            } else {
                if (nums[midden] >= rotate || nums[midden] < target) {
                    min = midden + 1;
                } else {
                    max = midden - 1;
                }
            }
        }
        return false;
    }
}
