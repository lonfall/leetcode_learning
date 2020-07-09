package com.lh.learning.leetcode.no27;

/**
 * @auther: loneyfall
 * @date: 2020/7/9
 * @description: 移除元素
 */
public class Question27 {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            while (size > i && nums[size - 1] == val) {
                size--;
            }
            if (nums[i] == val && size > i) {
                nums[i] = nums[--size];
            }
        }
        return size;
    }
}
