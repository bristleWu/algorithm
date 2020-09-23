package com.bristle.binary;

/**
 * @author yixuanWu
 * @version 1.0
 * @description 最基础的二分查找
 * @date 2020-09-19 20:59
 * <p>
 * 在一个顺序数组中找到一个数
 * example:
 * nums: 1,3,5,6,8
 * target: 8
 * return 4
 */
public class FindNum {


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 8};
        for (int i = 0; i < nums.length - 1; i++) {
            int index = new FindNum().findNum(nums, nums[i]);
            System.out.println(index);
        }
        int index = new FindNum().findNum(nums, 10);
        System.out.println(index);
    }


    int findNum(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] > target) {
                r = mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
