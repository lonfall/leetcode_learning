package com.lh.learning.leetcode.no18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 此题解超时
 *
 * @auther: loneyfall
 * @date: 2019/12/31
 * @description: 四数之和
 */
public class Question18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        Point p1 = new Point(0, 1, nums);
        Point p2;
        do {
            p2 = new Point(p1.a, p1.b, nums);
            if (p2.next(p1)) {
                do {
                    if (p1.sum(nums) + p2.sum(nums) == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[p1.a]);
                        list.add(nums[p1.b]);
                        list.add(nums[p2.a]);
                        list.add(nums[p2.b]);
                        Collections.sort(list);
                        if (!containsList(result, list)) {
                            result.add(list);
                        }
                    }
                } while (p2.nextSkip(p1));
            }
        } while (p1.nextSkip());
        return result;
    }

    private boolean containsList(List<List<Integer>> result, List<Integer> list) {
        if (null == list) {
            return false;
        }
        for (List<Integer> l : result) {
            if (null != l && l.size() == list.size()) {
                boolean flag = true;
                for (int i = 0; i < list.size(); i++) {
                    if (!l.get(i).equals(list.get(i))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class Point {
        private int a;
        private int b;
        private int length;
        private int[] nums;

        public Point(int a, int b, int[] nums) {
            this.a = a;
            this.b = b;
            this.nums = nums;
            this.length = nums.length;
        }

        public boolean isEnd() {
            if (a >= length - 2) {
                return true;
            }
            return false;
        }

        public boolean next() {
            if (isEnd()) {
                return false;
            }

            if (a + 1 < b) {
                a++;
            } else {
                b++;
                a = 0;
            }
            return true;
        }

        public boolean nextSkip() {
            if (isEnd()) {
                return false;
            }

            if (a + 1 < b) {
                return nextSkipA();
            } else {
                return nextSkipB();
            }
        }

        private boolean nextSkipA() {
            do {
                a++;
            } while (a < length - 1 && nums[a] == nums[a - 1]);
            if (a >= b) {
                return nextSkipB();
            }
            return true;
        }

        private boolean nextSkipB() {
            a = 0;
            do {
                b++;
            } while (b < length && nums[b] == nums[b - 2]);
            if (b >= length) {
                b = length - 1;
                return false;
            }
            return true;
        }

        public boolean next(Point point) {
            if (next()) {
                if (point.a == this.a || point.b == this.b || point.a == this.b || point.b == this.a) {
                    return next(point);
                }
                return true;
            } else {
                return false;
            }
        }

        public boolean nextSkip(Point point) {
            if (!nextSkip()) {
                return false;
            }
            if (point.a == this.a || point.b == this.b || point.a == this.b || point.b == this.a) {
                while (next()) {
                    if (point.a == this.a || point.b == this.b || point.a == this.b || point.b == this.a) {
                        continue;
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int sum(int[] nums) {
            return nums[a] + nums[b];
        }
    }
}
