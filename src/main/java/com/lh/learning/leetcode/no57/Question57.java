package com.lh.learning.leetcode.no57;

import java.util.ArrayList;
import java.util.List;

/**
 * 效率太低，需要优化
 *
 * @auther: loneyfall
 * @date: 2021/3/4
 * @description: 插入区间
 */
public class Question57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<int[]>();
        boolean find = false;
        for (int i = 0; i < intervals.length; i++) {
            if (find) {
                if (result.get(result.size() - 1)[1] < intervals[i][0]) {
                    result.add(intervals[i]);
                } else {
                    result.get(result.size() - 1)[1] = Math.max(intervals[i][1], result.get(result.size() - 1)[1]);
                }
            } else {
                if (newInterval[0] < intervals[i][0]) {
                    find = true;
                    i--;
                    if (result.size() == 0) {
                        result.add(newInterval);
                    } else if (result.get(result.size() - 1)[1] < newInterval[0]) {
                        result.add(newInterval);
                    } else {
                        result.get(result.size() - 1)[1] = Math.max(newInterval[1], result.get(result.size() - 1)[1]);
                    }
                } else {
                    result.add(intervals[i]);
                }
            }
        }

        if (!find) {
            if (result.size() == 0) {
                result.add(newInterval);
            } else if (result.get(result.size() - 1)[1] < newInterval[0]) {
                result.add(newInterval);
            } else {
                result.get(result.size() - 1)[1] = Math.max(newInterval[1], result.get(result.size() - 1)[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
