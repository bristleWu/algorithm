package com.bristle.sort;

import java.util.Arrays;

/**
 * @author yixuanWu
 * @version 1.0
 * @description 归并排序
 * @date 2020-09-18 23:16
 */
public class MergeSort {
    int[] temp;

    void mergeSort(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
    }

    void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {
        int m = mid;
        int r = right;
        int l = left;
        int index = right;
        while (m >= left || r > mid) {
            if (r <= mid || ( m >= left && nums[m] > nums[r])) {
                temp[index--] = nums[m--];
            } else {
                temp[index--] = nums[r--];
            }
        }
        System.arraycopy(temp, left, nums, left, right - left + 1);
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 11};
        int[] nums2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 11};
        new MergeSort().mergeSort(nums);
        new QuickSort().quickSort(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }


}
