package com.lh.learning.leetcode.no39;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和
 *
 * @auther: loneyfall
 * @date: 2020/10/15
 * @description:
 */
public class Question39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 1; i < candidates.length; i++) {
            for (int j = 0; j < candidates.length - i; j++) {
                if (candidates[j] > candidates[j + 1]) {
                    int t = candidates[j + 1];
                    candidates[j + 1] = candidates[j];
                    candidates[j] = t;
                }
            }
        }

        List<List<Integer>> result = combinationSumAfterInit(candidates, target);
        return result;
    }

    public List<List<Integer>> combinationSumAfterInit(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int select : candidates) {
            if (select > target) {
                break;
            }
            if (select == target) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(select);
                result.add(list);
                break;
            }
            List<List<Integer>> cList = combinationSumAfterInit(candidates, target - select);
            for (List<Integer> c : cList) {
                if (null == c || c.get(0) < select) {
                    continue;
                }
                List<Integer> list = new ArrayList<Integer>();
                list.add(select);
                list.addAll(c);
                result.add(list);
            }
        }
        return result;
    }
}
