package com.lh.learning.leetcode.no71_80.no80;

/**
 * @auther: loneyfall
 * @date: 2021/9/13
 * @description: 删除有序数组中的重复项 II
 */
public class Question80 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int current = nums[0];
        int flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if (flag < 2) {
                if (current == nums[i]) {
                    flag++;
                } else {
                    current = nums[i];
                    flag = 1;
                }
                nums[count] = nums[i];
                count++;
            } else if (current != nums[i]) {
                current = nums[i];
                flag = 1;
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
