package com.lh.learning.leetcode.no87;

/**
 * @auther: loneyfall
 * @date: 2023/2/19
 * @description: 扰乱字符串
 * <p>
 * 前后字符串可能形成的规律:
 * 1.原字符的某个前面的字符和后面的字符互相交换（错误：不能以此标准做判断，前后可能存在重复的字符）
 * 想不出来其他的
 * <p>
 * 解题猜想：
 * 1.暴力破解法：模拟所有可能的断开位置（o(n)），模拟所有的交换操作（o(2n)）,递推所有的子字符串重复上述操作（o(2n平方)）,
 * ----直到找到正确模式返回true，否则返回false，时间复杂度O(n平方)太高
 * 2.暴力破解基础上试着加上部分判断减少一部分复杂度，找规律：
 * ----1、第一步模拟断开位置后（o(n)），从端开位置下标，前后字符的总体构成相同，即abb=bab 等于 (a x 1)+(b x 2) = (a x 1)+(b x 2),
 * --------可以凭此提前判断断开位置是否符合需求。怎么判断：map<char,int>循环一遍各收集一遍前后s1,s2目标位置前后子串字符个数，循环一遍map比较（o(2n)）
 * ----2、第一步检查通过了在进行递推字串重复上述操作（O(n logn)）（感觉这种解法还是不够美观=-=）
 * 3.暂时想不到了，先试试第二种解法
 */
public class Question87 {

    public boolean isScramble(String s1, String s2) {
        if (s1.length() == 1 && s2.length() == 1 && s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {

        }
        return false;
    }
}
