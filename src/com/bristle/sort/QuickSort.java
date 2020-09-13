package com.bristle.sort;

import java.util.Arrays;

/**
 * @author GouWei
 * @version 1.0
 * @description 快速排序
 * {3,4,2,1,7}
 * 1. 确定分界点 x -> left/mid/right
 * 2. 调整位置,使: 左边 <= x 右边 >= x n
 * 3. 递归处理左右两边
 * @date 2020-09-12 23:16
 */
public class QuickSort {


    void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int x = nums[left], i = left - 1, j = right + 1;
        while (i < j) {
            do i++; while (nums[i] < x);
            do j--; while (nums[j] > x);
            if (i < j) swap(nums, i, j);
        }
        sort(nums, left, j);
        sort(nums, j + 1, right);

    }


    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5};
        new QuickSort().quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }


}
