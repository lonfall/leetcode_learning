package com.lh.learning.leetcode.no12;

/**
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description:
 */
public class Question12 {
    public String intToRoman(int num) {
        int unit = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;
        int thousand = num / 1000 % 10;
        return "";
    }

    private String formart(int num, char unit, char helf, char ten) {
        String result = "";
        if (num < 4) {
            for (int i = 0; i < num; i++) {
                result += unit;
            }
        } else if (num == 4) {

        }
        return result;
    }
}
