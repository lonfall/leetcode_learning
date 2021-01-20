package com.lh.learning.leetcode.no47;

import java.util.*;

/**
 * 参考46.全排列的题解使用回溯算法
 * 区别是使用hashMap存储选中项的值
 * 以此筛选掉值重复的项
 *
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description: 全排列 II
 */
public class Question47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] status = new boolean[nums.length];
        permute(nums, status, stack, result, 0);
        return result;
    }

    private void permute(int[] nums, boolean[] status, Stack<Integer> stack, List<List<Integer>> result, int len) {
        if (len == nums.length) {
            result.add(new ArrayList<Integer>(stack));
            return;
        }
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (status[i]) {
                continue;
            }
            // 筛选掉值重复的项
            if (map.containsKey(nums[i])) {
                continue;
            }
            map.put(nums[i], nums[i]);
            status[i] = true;
            stack.push(nums[i]);
            permute(nums, status, stack, result, ++len);
            status[i] = false;
            stack.pop();
            len--;
        }
    }
}
