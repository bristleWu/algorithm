package com.bristle.binary;

import java.util.Arrays;

/**
 * @author yixuanWu
 * @version 1.0
 * @description leetcode 34. 在排序数组中查找元素的第一个和最后一个位置
 * @date 2020-09-19 12:16
 * @source https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * 给定一个按照升序排列的长度为n的整数数组,和一个查询
 * 对于每个查询，返回一个元素k的起始位置和终止位置（位置从0开始计数）。
 * 如果数组中不存在该元素，则返回“-1 -1”。
 * example: 1 2 2 3 3 4
 * in: 3
 * out: 3 , 4
 * in: 4
 * out: 5, 5
 * in: 5
 * out: -1, -1
 */
public class NumberRange {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] range = new NumberRange().numberRange(nums, 10);
        System.out.println(Arrays.toString(range));

    }


    int[] numberRange(int[] nums, int target) {
        int l = 0, r = nums.length;
        int[] res = {-1, -1};
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid;
            } else {
                while (mid > 0 && nums[mid - 1] == target) {
                    mid--;
                }
                res[0] = mid;
                while (mid < nums.length - 1 && nums[mid + 1] == target) {
                    mid++;
                }
                res[1] = mid;
                return res;
            }
        }
        return res;
    }


}







