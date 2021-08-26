package com.lh.learning.leetcode.everyday;

import java.util.*;

/**
 * 太慢了
 *
 * @auther: loneyfall
 * @date: 2021/8/26
 * @description: 救生艇
 */
public class Question881Bad {
    public int numRescueBoats(int[] people, int limit) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList();
        for (int p : people) {
            if (map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                list.add(p);
                map.put(p, 1);
            }
        }
        Collections.sort(list);
        int i = 0, j = list.size() - 1, count = 0;
        while (i <= j) {
            int x = list.get(i), y = list.get(j);
            if (i == j) {
                if (x + y <= limit) {
                    count += (map.get(x) / 2) + (map.get(x) % 2);
                } else {
                    count += map.get(x);
                }
                j--;
            } else if (x + y <= limit) {
                if (map.get(x) < map.get(y)) {
                    map.put(y, map.get(y) - map.get(x));
                    count += map.get(x);
                    i++;
                } else if (map.get(x) > map.get(y)) {
                    map.put(x, map.get(x) - map.get(y));
                    count += map.get(y);
                    j--;
                } else {
                    count += map.get(y);
                    i++;
                    j--;
                }
            } else {
                count += map.get(y);
                j--;
            }
        }
        return count;
    }
}
