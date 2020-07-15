package com.lh.learning.leetcode.no21_30.no28;

/**
 * @auther: loneyfall
 * @date: 2020/7/10
 * @description: 实现 strStr()
 */
public class Question28 {
    public int strStr(String haystack, String needle) {
        char[] v1 = haystack.toCharArray();
        char[] v2 = needle.toCharArray();
        if (v2.length == 0) {
            return 0;
        }
        int index = -1;
        for (int i = 0; i <= v1.length - v2.length; i++) {
            boolean equals = true;
            for (int j = 0; j < v2.length; j++) {
                if (v1[i + j] != v2[j]) {
                    equals = false;
                    break;
                }
            }
            if (equals) {
                index = i;
                break;
            }
        }
        return index;
    }
}
