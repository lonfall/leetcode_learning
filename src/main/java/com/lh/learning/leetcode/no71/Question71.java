package com.lh.learning.leetcode.no71;

import java.util.Stack;

/**
 * todo 时间效率低，需要优化
 *
 * @auther: loneyfall
 * @date: 2021/5/6
 * @description: 简化路径
 */
public class Question71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String t = "";
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == '/' && t.length() > 0) {
                if ("..".equals(t)) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else if (!".".equals(t)) {
                    stack.push(t);
                }
                t = "";
            } else if (ch != '/') {
                t += ch;
            }
        }
        if (t.length() > 0) {
            if ("..".equals(t)) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (!".".equals(t)) {
                stack.push(t);
            }
        }

        String result = "";
        while (!stack.empty()) {
            String s = stack.pop();
            result = "/" + s + result;
        }
        if (result.length() == 0) {
            return "/";
        }
        return result;
    }
}
