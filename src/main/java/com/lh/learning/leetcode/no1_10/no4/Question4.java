package com.lh.learning.leetcode.no1_10.no4;

/**
 * 4. 寻找两个有序数组的中位数
 * <p>
 * Created by loneyfall on 2019/5/24.
 */
public class Question4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 如果其中一个数组为空，那么直接对另一个数组进行中值计算
        if (nums1 == null) {
            return findMedianSortedArraysOnly(nums2);
        } else if (nums2 == null) {
            return findMedianSortedArraysOnly(nums1);
        }
        if (nums1.length >= nums2.length) {
            return findMedianSortedArraysOrder(nums1, nums2);
        } else {
            return findMedianSortedArraysOrder(nums2, nums1);
        }
    }

    private double findMedianSortedArraysOnly(int[] nums) {
        int i = nums.length / 2;
        int j = (nums.length - 1) / 2;
        return (nums[i] + nums[j]) / 2.0;
    }

    private double findMedianSortedArraysOrder(int[] nums1, int[] nums2) {
        return findMedianSortedArraysOrderCallback(nums1, nums2, 0, nums1.length);
    }

    private double findMedianSortedArraysOrderCallback(int[] nums1, int[] nums2, int imin, int imax) {
        int m = nums1.length;
        int n = nums2.length;
        int i = (imin + imax) / 2;
        int j = (m + n + 1) / 2 - i;
        if (i < imax && j > 0 && nums1[i] < nums2[j - 1]) {
            return findMedianSortedArraysOrderCallback(nums1, nums2, i + 1, imax);
        } else if (i > imin && j < n && nums1[i - 1] > nums2[j]) {
            return findMedianSortedArraysOrderCallback(nums1, nums2, imin, i - 1);
        } else {
            int maxLeft;
            if (i == 0) {
                maxLeft = nums2[j - 1];
            } else if (j == 0) {
                maxLeft = nums1[i - 1];
            } else {
                maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
            }
            if ((m + n) % 2 == 1) {
                return maxLeft;
            }

            int minRight;
            if (i == m) {
                minRight = nums2[j];
            } else if (j == n) {
                minRight = nums1[i];
            } else {
                minRight = Math.min(nums1[i], nums2[j]);
            }
            return (maxLeft + minRight) / 2.0;
        }
    }
}
