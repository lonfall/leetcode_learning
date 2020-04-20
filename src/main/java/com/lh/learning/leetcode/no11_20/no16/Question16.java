package com.lh.learning.leetcode.no11_20.no16;

import java.util.Arrays;

/**
 * 做过上一题，这一道题直接拿排序+双指针来套
 * 与上一题的不同之处在于找最接近的绝对值而不是0
 * 首先定义一个求绝对值算法
 * 排序输入，固定一个数遍历，双指针找另外两个数，每次计算绝对值
 * 如果绝对值比之前的要小，则更新绝对值和最小的结果
 * 最后遍历全部数据输出结果
 *
 * @auther: loneyfall
 * @date: 2019/12/19
 * @description: 最接近的三数之和
 */
public class Question16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int index_a = 0;
        int index_b = index_a + 1;
        int index_c = nums.length - 1;

        int result = nums[index_a] + nums[index_b] + nums[index_c];
        int abs_min = abs(target - result);
        p:
        while (index_a < nums.length - 2) {
            int a = nums[index_a];
            while (index_b < index_c) {
                int b = nums[index_b];
                int c = nums[index_c];
                int sum = nums[index_a] + nums[index_b] + nums[index_c];
                if (sum == target) {
                    abs_min = 0;
                    result = sum;
                    break p;
                }
                int abs = abs(target - sum);
                if (abs < abs_min) {
                    abs_min = abs;
                    result = sum;
                }
                if (sum > target) {

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

    private static int abs(int num) {
        return num >= 0 ? num : -num;
    }
}
