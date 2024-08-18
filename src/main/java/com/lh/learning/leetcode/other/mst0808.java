package com.lh.learning.leetcode.other;

import java.util.*;

// 面试题08.08.
public class mst0808 {

    public String[] permutation(String S) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<String> result = new ArrayList<>();
        per(map, result, "");
        return result.toArray(new String[0]);
    }

    private void per(Map<Character, Integer> map, List<String> result, String buffer) {
        boolean flag = true;
        for (Character c : map.keySet().toArray(new Character[0])) {
            Integer count = map.get(c);
            if (count > 0) {
                flag = false;
                map.put(c, count - 1);
                per(map, result, buffer + c);
                map.put(c, count);
            }
        }
        if (flag && buffer.length() > 0) {
            result.add(buffer);
        }
    }

    public static void main(String[] args) {
        mst0808 t = new mst0808();
//        t.permutation("qqe");
//        t.permutation("ab");
//        t.permutation("a");
        t.permutation("accai");
    }
}
