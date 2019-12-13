package com.lh.learning.leetcode.no1_10.no6;

/**
 * @auther: loneyfall
 * @date: 2019/5/28
 * @description: Z 字形变换
 */
public class Question6 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuffer buffer = new StringBuffer();
        char[] str = s.toCharArray();
        // 解题思路：把z字的每一条线看作一个整体，每条线的长度都为numRows，且头尾共用一个元素
        for (int i = 0; i < numRows; i++) {
            // 是否是头一行或最后一行
            if (i == 0 || i == numRows - 1) {
                // 遍历该行（头尾共用一个元素，可以看作只有下移没有上移,或者只有上移没有下移,移动距离皆为（numRows - 1） * 2）
                int index = i;
                while (index < str.length) {
                    buffer.append(str[index]);
                    index += numRows * 2 - 2;
                }
            } else {
                int index = i;
                boolean mid = false;
                // 遍历该行（先下移后上移，交替循环）
                while (index < str.length) {
                    buffer.append(str[index]);
                    if (mid) {
                        index += i * 2;
                    } else {
                        index += numRows * 2 - i * 2 - 2;
                    }
                    mid = !mid;
                }
            }
        }
        return buffer.toString();
    }

}
