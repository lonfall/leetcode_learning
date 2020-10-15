package com.lh.learning.leetcode.no40;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和 II
 *
 * @auther: loneyfall
 * @date: 2020/10/15
 * @description:
 */
public class Question40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        for (int i = 1; i < candidates.length; i++) {
            for (int j = 0; j < candidates.length - i; j++) {
                if (candidates[j] > candidates[j + 1]) {
                    int t = candidates[j + 1];
                    candidates[j + 1] = candidates[j];
                    candidates[j] = t;
                }
            }
        }

        List<List<Integer>> result = combinationSumAfterInit(candidates, target, 0);
        return result;
    }

    public List<List<Integer>> combinationSumAfterInit(int[] candidates, int target, int index) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = index; i < candidates.length; i = nextIndex(candidates, i)) {
            int select = candidates[i];
            if (select > target) {
                break;
            }
            if (select == target) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(select);
                result.add(list);
                break;
            }
            List<List<Integer>> cList = combinationSumAfterInit(candidates, target - select, i + 1);
            for (List<Integer> c : cList) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(select);
                list.addAll(c);
                result.add(list);
            }
        }
        return result;
    }

    public int nextIndex(int[] candidates, int prev) {
        int prev_select = candidates[prev];
        int i = prev + 1;
        for (; i < candidates.length; i++) {
            if (candidates[i] != prev_select) {
                break;
            }
        }
        return i;
    }
}
