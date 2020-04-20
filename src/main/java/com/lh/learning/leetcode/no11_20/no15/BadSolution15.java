package com.lh.learning.leetcode.no11_20.no15;

import java.util.ArrayList;
import java.util.List;

/**
 * 穷举法超时
 *
 * @auther: loneyfall
 * @date: 2019/12/17
 * @description: 三数之和
 */
public class BadSolution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return result;
        }
        int index_a = 0;
        int index_b = 1;
        int index_c = 2;

        while (true) {
            if (nums[index_a] + nums[index_b] + nums[index_c] == 0) {
                List<Integer> list = new ArrayList<Integer>();
                Integer a = nums[index_a];
                Integer b = nums[index_b];
                Integer c = nums[index_c];
                list.add(a);
                list.add(b);
                list.add(c);
                boolean flag = false;
                p:
                for (List<Integer> re : result) {
                    boolean flag_a = false;
                    boolean flag_b = false;
                    boolean flag_c = false;
                    for (Integer i : re) {
                        if (!flag_a && i.equals(a)) {
                            flag_a = true;
                        } else if (!flag_b && i.equals(b)) {
                            flag_b = true;
                        } else if (!flag_c && i.equals(c)) {
                            flag_c = true;
                        }
                        if (flag_a && flag_b && flag_c) {
                            flag = true;
                            break p;
                        }
                    }
                }
                if (!flag) {
                    result.add(list);
                }
            }
            if (++index_c < nums.length) {

            } else if (++index_b < nums.length - 1) {
                index_c = index_b + 1;
            } else if (++index_a < nums.length - 2) {
                index_b = index_a + 1;
                index_c = index_b + 1;
            } else {
                break;
            }
        }
        return result;
    }
}
