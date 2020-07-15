package com.lh.learning.leetcode.no21_30.no30;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 还有很大优化空间
 * 采用的滑动窗口法
 *
 * @auther: loneyfall
 * @date: 2020/7/14
 * @description: 串联所有单词的子串
 */
public class Question30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        int size = words.length;
        if (size == 0) {
            return result;
        }
        int len = words[0].length();
        if (s.length() < size * len) {
            return result;
        }
        for (int i = 0; i <= s.length() - (size * len); i++) {
            boolean[] bl = new boolean[words.length];
            int k = i;
            for (int j = 0; j < size; j++) {
                int m = k + j * len;
                String temp = s.substring(m, m + len);
                boolean find = false;
                for (int x = 0; x < words.length; x++) {
                    if (!bl[x] && temp.equals(words[x])) {
                        bl[x] = true;
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    break;
                }
            }
            boolean allFind = true;
            for (boolean bf : bl) {
                if (!bf) {
                    allFind = false;
                    break;
                }
            }
            if (allFind) {
                result.add(i);
            }
        }
        return result;
    }
}
