package com.lh.learning.leetcode.no22;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2020/7/1
 * @description: 括号生成
 */
public class Question22 {
    public List<String> generateParenthesis(int n) {
        int open = n, close = n;
        List<String> result = getResult(open, close, "");
        return result;
    }

    private List<String> getResult(int open, int close, String left) {
        List<String> result = new ArrayList<String>();
        if (open == 0) {
            if (open == close) {
                result.add(left);
            } else {
                List<String> t2 = getResult(open, close - 1, left + ")");
                result.addAll(t2);
            }
        } else {
            if (open == close) {
                // 如果剩下括号数相等，则
                List<String> t1 = getResult(open - 1, close, left + "(");
                result.addAll(t1);
            } else {
                // 如果剩下的括号数不相等
                List<String> t1 = getResult(open - 1, close, left + "(");
                List<String> t2 = getResult(open, close - 1, left + ")");
                result.addAll(t1);
                result.addAll(t2);
            }
        }
        return result;
    }
}
