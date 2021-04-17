package com.lh.learning.leetcode.no67;

/**
 * @auther: loneyfall
 * @date: 2021/4/17
 * @description: 二进制求和
 */
public class Question67 {
    public String addBinary(String a, String b) {
        String result = "";
        int max_length = Math.max(a.length(), b.length());
        boolean carry = false;
        for (int i = 0; i < max_length; i++) {
            char ac = i < a.length() ? a.charAt(a.length() - 1 - i) : '0';
            char bc = i < b.length() ? b.charAt(b.length() - 1 - i) : '0';
            if ('1' == ac && '1' == bc) {
                if (carry) {
                    carry = true;
                    result = "1" + result;
                } else {
                    carry = true;
                    result = "0" + result;
                }
            } else if ('0' == ac && '0' == bc) {
                if (carry) {
                    carry = false;
                    result = "1" + result;
                } else {
                    carry = false;
                    result = "0" + result;
                }
            } else {
                if (carry) {
                    carry = true;
                    result = "0" + result;
                } else {
                    carry = false;
                    result = "1" + result;
                }
            }
        }
        if (carry) {
            result = "1" + result;
        }
        return result;
    }
}
