package com.lh.learning.leetcode.no31_40.no38;

/**
 * @auther: loneyfall
 * @date: 2020/8/6
 * @description: 外观数列
 */
public class Question38 {
    private static String[] list = new String[30];

    static {
        list[0] = "1";
    }

    public String countAndSay(int n) {
        if (list[n - 1] != null) {
            return list[n - 1];
        }
        for (int i = 1; i < n; i++) {
            if (list[i] != null) {
                continue;
            }
            StringBuffer sb = new StringBuffer();
            char t = list[i - 1].charAt(0);
            int count = 1;
            for (int j = 1; j < list[i - 1].length(); j++) {
                if (list[i - 1].charAt(j) == t) {
                    count++;
                } else {
                    sb.append("" + count + t);
                    t = list[i - 1].charAt(j);
                    count = 1;
                }
            }
            sb.append("" + count + t);
            list[i] = sb.toString();
        }
        return list[n - 1];
    }
}
