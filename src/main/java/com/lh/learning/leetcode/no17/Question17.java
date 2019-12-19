package com.lh.learning.leetcode.no17;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2019/12/19
 * @description: 电话号码的字母组合
 */
public class Question17 {
    String[][] index = new String[][]{{"a", "b", "c"}, {"d", "e", "f"},
            {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
            {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) {
            return result;
        }

        for (String t : index[digits.charAt(0) - '2']) {
            if (digits.length() > 1) {
                List<String> subResult = letterCombinations(digits.substring(1));
                for (String subStr : subResult) {
                    result.add(t + subStr);
                }
            } else {
                result.add(t);
            }
        }
        return result;
    }
}
