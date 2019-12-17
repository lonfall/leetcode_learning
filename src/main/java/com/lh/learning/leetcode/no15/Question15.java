package com.lh.learning.leetcode.no15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 先对数组进行排序，对一个数固定遍历，使用双指针法遍历另外两个数
 * 计算加值，如果等于0则计入返回值，如果大于0则右指针向左移动，减小加值
 * 如果小于0则左指针向右移动，增加加值。
 *
 * @auther: loneyfall
 * @date: 2019/12/16
 * @description: 三数之和
 */
public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int index_a = 0;
        int index_b = index_a + 1;
        int index_c = nums.length - 1;
        while (index_a < nums.length - 2) {
            int a = nums[index_a];
            while (index_b < index_c) {
                int b = nums[index_b];
                int c = nums[index_c];
                int sum = a + b + c;
                if (sum == 0) {
                    result.add(Arrays.asList(a, b, c));
                    while (index_c > index_a && c == nums[index_c]) {
                        --index_c;
                    }
                    while (index_b < nums.length - 1 && b == nums[index_b]) {
                        ++index_b;
                    }
                } else if (sum > 0) {
                    while (index_c > index_a && c == nums[index_c]) {
                        --index_c;
                    }
                } else {
                    while (index_b < nums.length - 1 && b == nums[index_b]) {
                        ++index_b;
                    }
                }
            }
            while (index_a < nums.length - 2 && a == nums[index_a]) {
                ++index_a;
            }
            index_b = index_a + 1;
            index_c = nums.length - 1;
        }
        return result;
    }
}
