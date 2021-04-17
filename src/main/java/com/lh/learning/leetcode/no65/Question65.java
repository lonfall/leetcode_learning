package com.lh.learning.leetcode.no65;

/**
 * @auther: loneyfall
 * @date: 2021/4/8
 * @description: 有效数字
 */
public class Question65 {
    public boolean isNumber(String s) {
        String[] es = s.split("e|E", -1);
        if (es.length == 1) {
            if (isInteger(es[0])) {
                return true;
            } else {
                return isDecimal(es[0]);
            }
        } else if (es.length == 2) {
            if (isInteger(es[0])) {
                return isInteger(es[1]);
            } else {
                if (isDecimal(es[0])) {
                    return isInteger(es[1]);
                }
            }
        }
        return false;
    }

    private boolean isDecimal(String s) {
        if (s.length() == 0) {
            return false;
        }
        String[] ps = s.split("\\.", -1);
        if (ps.length != 2) {
            return false;
        }
        boolean sign = ps[0].length() > 0 && (ps[0].charAt(0) == '+' || ps[0].charAt(0) == '-');
        if (ps[0].length() == (sign ? 1 : 0) && ps[1].length() == 0) {
            return false;
        }
        for (int i = sign ? 1 : 0; i < ps[0].length(); i++) {
            if (!isNumber(ps[0].charAt(i))) {
                return false;
            }
        }
        for (int i = 0; i < ps[1].length(); i++) {
            if (!isNumber(ps[1].charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isInteger(String s) {
        if (s.length() == 0) {
            return false;
        }
        boolean sign = s.charAt(0) == '+' || s.charAt(0) == '-';
        if (sign && s.length() == 1) {
            return false;
        }
        for (int i = sign ? 1 : 0; i < s.length(); i++) {
            if (!isNumber(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}
