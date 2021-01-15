package com.lh.learning.leetcode.no46;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/1/15
 * @description: 全排列
 */
public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> numList = new ArrayList<Integer>();
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    numList.add(nums[j]);
                }
            }
            List<List<Integer>> numLists = permute(numList);
            for (List<Integer> nl : numLists) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                list.addAll(nl);
                result.add(list);
            }
        }
        return result;
    }

    private List<List<Integer>> permute(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (list.size() == 1) {
            result.add(list);
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            List<Integer> numList = new ArrayList<Integer>();
            for (int j = 0; j < list.size(); j++) {
                if (j != i) {
                    numList.add(list.get(j));
                }
            }
            List<List<Integer>> numLists = permute(numList);
            for (List<Integer> nl : numLists) {
                List<Integer> l = new ArrayList<Integer>();
                l.add(list.get(i));
                l.addAll(nl);
                result.add(l);
            }
        }
        return result;
    }
}
