package com.lh.learning.leetcode.no11_20.no12;

/**
 * 罗马数字每一位计数的规则一样
 * 只是表示单位的字符不一样
 * 这里取每一位的数字套入公式计算即可
 *
 * @auther: loneyfall
 * @date: 2019/12/13
 * @description: 整数转罗马数字
 */
public class Question12 {
    public String intToRoman(int num) {
        int unit = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;
        int thousand = num / 1000 % 10;
        return formart(thousand, 'M', '\0', '\0') + formart(hundred, 'C', 'D', 'M')
                + formart(ten, 'X', 'L', 'C') + formart(unit, 'I', 'V', 'X');
    }

    private String formart(int num, char unit, char helf, char ten) {
        String result = "";
        if (num < 4) {
            for (int i = 0; i < num; i++) {
                result += unit;
            }
        } else if (num == 4) {
            result += unit + "" + helf;
        } else if (num < 9) {
            result += helf;
            for (int i = 0; i < num - 5; i++) {
                result += unit;
            }
        } else if (num == 9) {
            result += unit + "" + ten;
        }
        return result;
    }
}
