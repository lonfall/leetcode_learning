package com.lh.learning.leetcode.no1_10.no10;

import java.util.ArrayList;
import java.util.List;

/**
 * 这道题的执行效率比较低，仅供参考
 * <p>
 * 我之前的思路是把?*的模式看作一个整体
 * 其他所有的字符看作一个整体，分别整块匹配
 * 后来发现*号个数不定的特性，在有多个*时很难划分整体
 * <p>
 * 现在的思路是：
 * 先划分表达式
 * 从左到右遍历字符串，依次匹配表达式
 * 表达式？*看作一个整体
 * 匹配？*时使用最小匹配原则，先从0个开始，递归匹配剩下的字符串
 * 最后通过表达式指针判断是否匹配整个字符串
 *
 * @auther: loneyfall
 * @date: 2019/8/6
 * @description: 正则表达式匹配
 */
public class Question10 {
    char dot = '.';
    char star = '*';

    public boolean isMatch(String s, String p) {
        List<String> pList = patternToArray(p);
        int pindex = 0;
        // 如果字符串和表达式都是空，那么字符串匹配
        if ("".equals(s) && "".equals(p)) {
            return true;
        }
        // 如果字符串和表达式只有一方为空，那么字符串不匹配
        if ("".equals(s) || "".equals(p)) {
            // 但是如果所有的正则都是带*，则匹配
            if (!"".equals(p)) {
                boolean starEnd = true;
                for (int x = 0; x < pList.size(); x++) {
                    if (pList.get(x).length() <= 1) {
                        starEnd = false;
                        break;
                    }
                }
                return starEnd;
            }
            return false;
        }

        boolean match = false;
        char[] list = s.toCharArray();

        // 遍历整个字符串进行匹配
        for (int i = 0; i < list.length; i++) {
            char cs = list[i];
            // 如果字符串还没匹配完，就没有正则了，那么就不匹配
            if (pindex >= pList.size()) {
                return false;
            }
            String sp = pList.get(pindex);
            // 如果是.*号匹配且是最后一个，那么可以匹配所有字符
            if (sp.length() > 1 && sp.charAt(0) == dot && pindex + 1 == pList.size()) {
                return true;
            }

            // 如果长度大于1，那么就是*，可以匹配零次或多次
            if (sp.length() > 1) {
                if (isMatch(s.substring(i), subListToStr(pList, pindex + 1))) {
                    // 递归匹配当前字符串,如果匹配那么直接返回true
                    return true;
                } else if (sp.charAt(0) == dot) {
                    // 如果是.*那么自动匹配当前字符，continue继续匹配剩余字符串
                    continue;
                } else if (sp.charAt(0) == cs) {
                    // 如果是其他字符+*且匹配当前字符，continue继续匹配剩余字符串
                    continue;
                } else {
                    // 如果不匹配当前字符，那么直接返回false
                    return false;
                }
            } else if (sp.charAt(0) == dot) {
                pindex++;
                continue;
            } else if (sp.charAt(0) == cs) {
                // 如果是其他字符，且匹配，那么continue，且匹配下一个正则
                pindex++;
                continue;
            } else {
                // 如果不匹配，直接返回false
                return false;
            }
        }
        // 如果遍历了所有正则，那么就是匹配
        if (pindex >= pList.size()) {
            match = true;
        } else {
            // 如果没有遍历完所有正则，但是后面都是带*号正则（可以匹配0次），那么就是匹配
            boolean starEnd = true;
            for (; pindex < pList.size(); pindex++) {
                if (pList.get(pindex).length() <= 1) {
                    starEnd = false;
                    break;
                }
            }
            if (starEnd) {
                match = true;
            }
        }
        return match;
    }

    private String subListToStr(List<String> pList, int index) {
        List<String> subList = pList.subList(index, pList.size());
        StringBuffer buffer = new StringBuffer();
        for (String str : subList) {
            buffer.append(str);
        }
        return buffer.toString();
    }

    private List<String> patternToArray(String p) {
        char[] pArray = p.toCharArray();
        List<String> pList = new ArrayList<String>();
        for (int i = 0; i < pArray.length; i++) {
            char cp = pArray[i];
            if (cp == dot) {
                if (i + 1 < pArray.length && pArray[i + 1] == star) {
                    pList.add("" + dot + star);
                    i++;
                    continue;
                } else {
                    pList.add("" + dot);
                    continue;
                }
            } else {
                if (i + 1 < pArray.length && pArray[i + 1] == star) {
                    pList.add("" + cp + star);
                    i++;
                    continue;
                } else {
                    pList.add("" + cp);
                    continue;
                }
            }
        }
        return pList;
    }
}
