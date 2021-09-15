package com.lh.learning.leetcode.no71_80.no75;

/**
 * @auther: loneyfall
 * @date: 2021/5/20
 * @description: 颜色分类
 */
public class Question75 {
    public void sortColors(int[] nums) {
        int index_i1 = 0, index_i2 = nums.length - 1;

        while (index_i1 < nums.length && nums[index_i1] == 0) {
            index_i1++;
        }
        while (index_i2 >= 0 && nums[index_i2] == 2) {
            index_i2--;
        }
        if (index_i1 < index_i2) {
            int index = index_i1;
            while (index <= index_i2) {
                if (nums[index] == 0) {
                    nums[index] = nums[index_i1];
                    nums[index_i1] = 0;
                    index_i1++;
                    index++;
                } else if (nums[index] == 2) {
                    nums[index] = nums[index_i2];
                    nums[index_i2] = 2;
                    index_i2--;
                    if (nums[index] == 0) {
                        nums[index] = nums[index_i1];
                        nums[index_i1] = 0;
                        index_i1++;
                    }
                    while (index_i2 >= 0 && nums[index_i2] == 2) {
                        index_i2--;
                    }
                    index++;
                } else {
                    index++;
                }
            }
        }
    }
}
