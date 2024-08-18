package com.lh.learning.leetcode.no674;

public class Question674 {

    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int j = i + 1;
            for (; j < nums.length; j++) {
                if (nums[j] <= nums[j - 1]) {
                    break;
                }
                count++;
            }
            if (result < count) {
                result = count;
            }
            i = j - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Question674 question = new Question674();
        System.out.println(question.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(question.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
        System.out.println(question.findLengthOfLCIS(new int[]{1, 2, 3, 2, 3, 4, 5, 1, 7}));
    }
}
