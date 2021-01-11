package com.lh.learning.leetcode.no43;

/**
 * 解题思路：num1和num2的每一位相乘，
 * 最后再把所有单个位数的乘积加起来，
 * 每个乘积要在后面添零，根据位数不同添的零个数不同
 *
 * @auther: loneyfall
 * @date: 2021/1/11
 * @description: 字符串相乘
 */
public class Question43 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        String result = "0";
        int l2 = num2.length();
        for (int i = l2 - 1; i >= 0; i--) {
            int n2 = charToInt(num2.charAt(i));
            result = add(result, multiply(num1, n2, l2 - i));
        }
        return result;
    }

    /**
     * 两字符串相加
     *
     * @param num1
     * @param num2
     * @return
     */
    private String add(String num1, String num2) {
        if ("0".equals(num1)) {
            return num2;
        } else if ("0".equals(num2)) {
            return num1;
        }
        String result = "";
        int l1 = num1.length();
        int l2 = num2.length();
        int carry = 0;
        for (int i = 1; i <= (l2 > l1 ? l2 : l1); i++) {
            int n1 = l1 - i >= 0 ? charToInt(num1.charAt(l1 - i)) : 0;
            int n2 = l2 - i >= 0 ? charToInt(num2.charAt(l2 - i)) : 0;
            int add = n1 + n2 + carry;
            result = intToChar(add % 10) + result;
            if (add > 9) {
                carry = add / 10 % 10;
            } else {
                carry = 0;
            }
        }
        if (carry > 0) {
            result = carry + result;
        }
        return result;
    }

    /**
     * 字符串和单个数字相乘
     * 根据位数要在后面添零
     *
     * @param num1
     * @param n2
     * @param digit
     * @return
     */
    private String multiply(String num1, int n2, int digit) {
        if ("0".equals(num1) || 0 == n2) {
            return "0";
        }
        String result = "";
        int l1 = num1.length();
        int carry = 0;
        for (int i = l1 - 1; i >= 0; i--) {
            int n1 = charToInt(num1.charAt(i));
            int product = n1 * n2 + carry;
            result = intToChar(product % 10) + result;
            if (product > 9) {
                carry = product / 10 % 10;
            } else {
                carry = 0;
            }
        }
        if (carry > 0) {
            result = carry + result;
        }
        for (int i = 1; i < digit; i++) {
            result += "0";
        }
        return result;
    }

    private char intToChar(int i) {
        return (char) ('0' + i);
    }

    private int charToInt(char charAt) {
        int num = charAt - '0';
        return num >= 0 && num <= 9 ? num : 0;
    }
}
