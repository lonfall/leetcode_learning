package com.lh.learning.leetcode.no3;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.无重复字符的最长子串
 * // TODO: 2019/5/29 题解时间未通过，待改进
 * <p>
 * Created by loneyfall on 2019/5/24.
 */
public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        List<AnHold> ahs = new ArrayList<AnHold>();
        for (char p : s.toCharArray()) {
            AnHold nah = new AnHold();
            nah.list.add(p);
            bk:
            for (AnHold ah : ahs) {
                if (ah.close) {
                    continue;
                }
                for (Character c : ah.list) {
                    if (c.equals(p)) {
                        ah.close = true;
                        continue bk;
                    }
                }
                ah.list.add(p);
                ah.len++;
            }
            ahs.add(nah);
        }
        int max = -1;
        for (AnHold ah : ahs) {
            if (ah.len > max) {
                max = ah.len;
            }
        }
        return max;
    }

    class AnHold {
        public int len = 1;
        public boolean close = false;
        public List<Character> list = new ArrayList();
    }
}
