package com.lh.learning.leetcode.no1614;

import java.util.Arrays;

public class Question1614 {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                count++;
                if (max < count) {
                    max = count;
                }
            } else if (chars[i] == ')') {
                count--;
            }
        }
        return max;
    }
}
