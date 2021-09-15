package com.lh.learning.leetcode.no71_80.no76;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: loneyfall
 * @date: 2021/7/17
 * @description: 最小覆盖子串
 */
public class Question76 {
    public String minWindow(String s, String t) {
        if ("".equals(t)) {
            return "";
        }
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            Character key = t.charAt(i);
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + 1);
            } else {
                map1.put(key, 1);
            }
        }
        boolean isCovered = false;
        int x = 0, y = 0;
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (map2.containsKey(key)) {
                map2.put(key, map2.get(key) + 1);
            } else if (map1.containsKey(key)) {
                map2.put(key, 1);
            }
            y = i;
            if (i >= t.length() && covered(map1, map2)) {
                isCovered = true;
                break;
            }
        }
        if (covered(map1, map2)) {
            isCovered = true;
        }
        if (isCovered) {
            while (x < y) {
                if (!map1.containsKey(s.charAt(x))) {
                    x++;
                } else if (map2.get(s.charAt(x)) > map1.get(s.charAt(x))) {
                    map2.put(s.charAt(x), map2.get(s.charAt(x)) - 1);
                    x++;
                } else {
                    break;
                }
            }
            while (x < y) {
                if (!map1.containsKey(s.charAt(y))) {
                    y--;
                } else if (map2.get(s.charAt(y)) > map1.get(s.charAt(y))) {
                    map2.put(s.charAt(y), map2.get(s.charAt(y)) - 1);
                    y--;
                } else {
                    break;
                }
            }
            int start = x, end = y;
            for (y++; y < s.length(); y++) {
                if (map2.containsKey(s.charAt(y))) {
                    map2.put(s.charAt(y), map2.get(s.charAt(y)) + 1);
                }
                if (s.charAt(y) == s.charAt(x)) {
                    while (x < y) {
                        if (!map1.containsKey(s.charAt(x))) {
                            x++;
                        } else if (map2.get(s.charAt(x)) > map1.get(s.charAt(x))) {
                            map2.put(s.charAt(x), map2.get(s.charAt(x)) - 1);
                            x++;
                        } else {
                            break;
                        }
                    }
                    if (end - start > y - x) {
                        start = x;
                        end = y;
                    }
                }
            }
            return s.substring(start, end + 1);
        } else {
            return "";
        }
    }

    private boolean covered(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key) || map2.get(key) < map1.get(key)) {
                return false;
            }
        }
        return true;
    }
}
