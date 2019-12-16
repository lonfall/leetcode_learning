package com.lh.learning.leetcode.no13;

/**
 * 上一题的逆向问题，先找规律，
 * 每个字母都代表一个数字，有两个特例4：IV，9：IX
 * 都可以记做V - I 和 X - I,并且后一个数都比前一个数大
 * 其他情况后一个数都比前一个数小
 * 则每次比较前后数的大小，如果存在后一个数比前一个数大
 * 则当前字母所对应的的数字记做-，否则记做+，计算完所以位置的字母则得到返回值
 *
 * @auther: loneyfall
 * @date: 2019/12/16
 * @description: 罗马数字转整数
 */
public class Question13 {
    char[] sign = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    int[] value = new int[]{1, 5, 10, 50, 100, 500, 1000};

    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int index = indexOfSign(ch);
            if (i + 1 < chars.length && index < indexOfSign(chars[i + 1])) {
                result -= value[index];
            } else {
                result += value[index];
            }
        }
        return result;
    }

    private int indexOfSign(char ch) {
        for (int i = 0; i < sign.length; i++) {
            if (sign[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}
