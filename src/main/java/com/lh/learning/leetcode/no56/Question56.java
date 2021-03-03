package com.lh.learning.leetcode.no56;

import java.util.ArrayList;
import java.util.List;

/**
 * todo 效率比较低，需要优化
 *
 * @auther: loneyfall
 * @date: 2021/3/3
 * @description: 合并区间
 */
public class Question56 {
    public int[][] merge(int[][] intervals) {
        sort(intervals);
        List<int[]> result = new ArrayList<int[]>();
        int[] t = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= t[1]) {
                t = new int[]{Math.min(intervals[i][0], t[0]), Math.max(intervals[i][1], t[1])};
            } else {
                result.add(t);
                t = intervals[i];
            }
        }
        result.add(t);
        return result.toArray(new int[result.size()][]);
    }

    private void sort(int[][] intervals) {
        int[] t;
        for (int i = intervals.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    t = intervals[j + 1];
                    intervals[j + 1] = intervals[j];
                    intervals[j] = t;
                }
            }
        }
    }
}
