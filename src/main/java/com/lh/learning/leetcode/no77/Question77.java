package com.lh.learning.leetcode.no77;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther: loneyfall
 * @date: 2021/8/26
 * @description: 组合
 */
public class Question77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // 后面必须有k-1个元素才会存在k个的组合
        for (int i = 0; i < n - k + 1; i++) {
            Stack<Integer> stack = new Stack();
            stack.push(i + 1);
            search(result, stack, k - 1, i, n);
        }
        return result;
    }

    private void search(List<List<Integer>> result, Stack<Integer> stack, int deep, int prev, int n) {
        if (deep == 0) {
            result.add(new ArrayList<Integer>(stack));
            return;
        }
        for (int i = prev + 1; i < n - deep + 1; i++) {
            stack.push(i + 1);
            search(result, stack, deep - 1, i, n);
            stack.pop();
        }
    }
}
