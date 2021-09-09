package com.lh.learning.leetcode.no78;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/9/9
 * @description: 子集
 */
public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subsets = new ArrayList<Integer>();
        findSubsets(nums, -1, subsets, result);
        return result;
    }

    private void findSubsets(int[] nums, int prev, List<Integer> subsets, List<List<Integer>> result) {
        List<Integer> subset = new ArrayList<Integer>(subsets);
        result.add(subset);
        for (int i = prev + 1; i < nums.length; i++) {
            subsets.add(nums[i]);
            findSubsets(nums, i, subsets, result);
            subsets.remove(subsets.size() - 1);
        }
    }
}
