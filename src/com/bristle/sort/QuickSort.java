package com.bristle.sort;

import java.util.Arrays;

/**
 * @author yixuanWu
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
        sort2(nums, 0, nums.length - 1);
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


    /**
     * example: 6, 5, 7, 2
     */
    void sort2(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int x = nums[left], i = left, j = right;
        while (i < j) {
            while (nums[i] < x) i++;
            while (nums[j] > x) j--;
            if (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        // x = 6; 第一次交换过后 i = 2 j = 1 nums: 2, 5, 7, 6
        // j走过的地方,end到j 可以保证: j + 1 -> end >= x
        // i走过的地方begin到i 则保证: begin -> i - 1 <= x
        // 直到跳出循环, i >=j, i == j 说明 nums[i] >= x && nums[j] <= x ,则 nums[i] == x
        // 否则 j <= i - 1;则有结论 begin -> j <= x; j + 1 -> end >= x;则分成两段,继续递归即可
        sort2(nums, left, j);
        sort2(nums, j + 1, right);

    }


    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 11};
        new QuickSort().quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }


}
