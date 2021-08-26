package com.lh.learning.leetcode.everyday;

import java.util.*;

/**
 * @auther: loneyfall
 * @date: 2021/8/26
 * @description: 救生艇
 */
public class Question881 {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0, j = people.length - 1, count = 0;
        Arrays.sort(people);
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            count++;
            j--;

        }
        return count;
    }
}
