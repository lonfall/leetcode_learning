package com.lh.learning.leetcode.no1_10.no8;

/**
 * @auther: loneyfall
 * @date: 2019/5/29
 * @description: 字符串转换整数 (atoi)
 */
public class Question8 {

    public int myAtoi(String str) {
        StringBuffer buffer = new StringBuffer();
        char[] chars = str.toCharArray();
        boolean scan = false;
        try {
            for (int i = 0; i < chars.length; i++) {
                if (!scan && chars[i] == ' ') {
                    continue;
                }
                if (!scan && (chars[i] == '-' || chars[i] == '+')) {
                    if (i + 1 < chars.length && Character.isDigit(chars[i + 1])) {
                        scan = true;
                        buffer.append(chars[i]);
                        continue;
                    } else {
                        return 0;
                    }
                }
                if (!scan && Character.isDigit(chars[i])) {
                    scan = true;
                    buffer.append(chars[i]);
                    continue;
                }
                if (scan && Character.isDigit(chars[i])) {
                    buffer.append(chars[i]);
                } else {
                    return buffer.length() == 0 ? 0 : Integer.valueOf(buffer.toString());
                }
            }
            if (scan) {
                return buffer.length() == 0 ? 0 : Integer.valueOf(buffer.toString());
            }
        } catch (NumberFormatException e) {
            if (buffer.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return 0;
    }
}
