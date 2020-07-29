package com.lh.learning.leetcode.no33;

/**
 * @auther: loneyfall
 * @date: 2020/7/20
 * @description: 搜索旋转排序数组
 */
public class Question33Error {
    public int search(int[] nums, int target) {
        int index = -1;
        if (nums.length == 0) {
            return index;
        } else if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int prev = nums[0];
        boolean search = prev == target;
        boolean rotate = true;
        if (nums[1] > nums[0]) {
            rotate = false;
        }
        if (search) {
            prev = nums[1];
            for (int i = 2; i < nums.length; i++) {
                if (rotate) {
                    if (nums[i] < prev || nums[i] > nums[0]) {
                        search = false;
                        break;
                    }
                } else {
                    if (nums[i] < prev) {
                        search = false;
                        break;
                    }
                }
            }
            return search ? 0 : -1;
        }
        if (nums[0] > target) {
            rotate = false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (!search) {
                if (nums[i] == target) {
                    search = true;
                    index = i;
                    prev = nums[i];
                    continue;
                }
                if (rotate) {
                    if (nums[i] < target) {
                        break;
                    }
                } else {
                    if (nums[i] > target) {
                        break;
                    }
                }
                if (nums[i] < prev) {
                    break;
                }
            } else {
                if (rotate && nums[i] > nums[0]) {
                    search = false;
                    break;
                }
                if (nums[i] < prev) {
                    search = false;
                    break;
                }
            }
            prev = nums[i];
        }
        return search ? index : -1;
    }
}
