package com.lh.learning.leetcode.no41_50.no44;

/**
 * todo 问题未解决
 * 该方法不可用，时间复杂度太高
 *
 * @auther: loneyfall
 * @date: 2021/1/14
 * @description: 通配符匹配
 */
public class Question44 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        if (s.length() == 0 && p.length() == 0) {
            return true;
        }
        int ls = s.length();
        int lp = p.length();
        int i1 = 0, i2 = 0;
        while (i1 < ls && i2 < lp) {
            if (p.charAt(i2) == '*') {
                while (i2 + 1 < lp) {
                    if (p.charAt(i2 + 1) == '*') {
                        i2++;
                    } else {
                        break;
                    }
                }
                for (int m = 0; m < ls - i1 + 1; m++) {
                    if (isMatch(s.substring(i1 + m), p.substring(i2 + 1))) {
                        return true;
                    }
                }
                return false;
            } else if (p.charAt(i2) == '?' || p.charAt(i2) == s.charAt(i1)) {
                i1++;
                i2++;
            } else {
                return false;
            }
        }
        if (i1 == ls && i2 == lp) {
            return true;
        } else if (i1 == ls && p.charAt(i2) == '*') {
            return isMatch("", p.substring(i2 + 1));
        }
        return false;
    }
}
