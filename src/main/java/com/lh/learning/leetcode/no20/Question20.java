package com.lh.learning.leetcode.no20;

import java.util.Stack;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description: 有效的括号
 */
public class Question20 {
    public boolean isValid(String s) {
        char[] chs1 = new char[]{'(', ')'};
        char[] chs2 = new char[]{'{', '}'};
        char[] chs3 = new char[]{'[', ']'};
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == chs1[0] || ch == chs2[0] || ch == chs3[0]) {
                stack.push(ch);
            } else if (ch == chs1[1]) {
                if (stack.empty()) {
                    return false;
                }
                if (stack.peek() != chs1[0]) {
                    return false;
                }
                stack.pop();
            } else if (ch == chs2[1]) {
                if (stack.empty()) {
                    return false;
                }
                if (stack.peek() != chs2[0]) {
                    return false;
                }
                stack.pop();
            } else if (ch == chs3[1]) {
                if (stack.empty()) {
                    return false;
                }
                if (stack.peek() != chs3[0]) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
