package com.lh.learning.leetcode.no61_70.no68;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/4/19
 * @description: 文本左右对齐
 */
public class Question68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<String>();
        int width = words[0].length();
        int start = 0;
        for (int i = 1; i < words.length; i++) {
            if (width + words[i].length() + i - start > maxWidth) {
                int t = ((i - start) == 1 ? 1 : (i - start - 1));
                int step = (maxWidth - width) / t;
                int over = (maxWidth - width) % t;
                StringBuffer sb = new StringBuffer();
                for (int j = start, index = -1; j < i; j++, index++) {
                    if (j > start) {
                        int space = index < over ? (step + 1) : step;
                        for (int x = 0; x < space; x++) {
                            sb.append(" ");
                        }
                    }
                    sb.append(words[j]);
                }
                if (i - start == 1) {
                    for (int x = 0; x < maxWidth - width; x++) {
                        sb.append(" ");
                    }
                }
                result.add(sb.toString());
                width = words[i].length();
                start = i;
            } else {
                width = width + words[i].length();
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int j = start, index = 0; j < words.length; j++, index++) {
            if (j > start) {
                sb.append(" ");
            }
            sb.append(words[j]);
        }
        for (int x = 0; x < maxWidth - width - words.length + start + 1; x++) {
            sb.append(" ");
        }
        result.add(sb.toString());
        return result;
    }
}
