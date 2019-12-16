package com.lh.learning.leetcode.no14;

/**
 * 按位数循环遍历所有字符串
 * 并比较，如果相等则退出循环
 * 最后截取子串
 *
 * @auther: loneyfall
 * @date: 2019/12/16
 * @description: 最长公共前缀
 */
public class Question14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;

        p:
        while (true) {
            if (index < strs[0].length()) {
                char a = strs[0].charAt(index);
                for (int i = 1; i < strs.length; i++) {
                    String str = strs[i];
                    if (index < str.length()) {
                        if (a != str.charAt(index)) {
                            break p;
                        }
                    } else {
                        break p;
                    }
                }
                index++;
            } else {
                break p;
            }
        }
        return strs[0].substring(0, index);
    }
}
