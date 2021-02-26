package com.lh.learning.leetcode.no41_50.no49;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/1/21
 * @description: 字母异位词分组
 */
public class Question49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<Integer> hashCodes = new ArrayList<Integer>();
        f1:
        for (int i = 0; i < strs.length; i++) {
            int hashCode = hashCodeStr(strs[i]);
            for (int j = 0; j < result.size(); j++) {
                if (strs[i].length() == result.get(j).get(0).length() && hashCode == hashCodes.get(j)) {
                    result.get(j).add(strs[i]);
                    continue f1;
                }
            }
            List<String> list = new ArrayList<String>();
            list.add(strs[i]);
            result.add(list);
            hashCodes.add(hashCode);
        }
        return result;
    }

    private int hashCodeStr(String str) {
        String hashCode = "abcdefghijklmnopqrstuvwxyz";
        char[] array = hashCode.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int j = str.charAt(i) - 'a';
            array[j] = (char) (array[j] + 1);
        }
        return new String(array).hashCode();
    }
}
