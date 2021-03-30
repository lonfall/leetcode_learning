package com.lh.learning.leetcode.no58;

/**
 * @auther: loneyfall
 * @date: 2021/3/30
 * @description: 最后一个单词的长度
 */
public class Question58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    continue;
                } else {
                    break;
                }
            }
            count++;
        }
        return count;
    }
}
