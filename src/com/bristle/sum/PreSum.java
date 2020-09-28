package com.bristle.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author yixuanWu
 * @version 1.0
 * @description 输入一个长度为n的整数序列。
 * <p>
 * 接下来再输入m个询问，每个询问输入一对l, r。
 * <p>
 * 对于每个询问，输出原序列中从第l个数到第r个数的和。
 * <p>
 * 输入格式
 * 第一行包含两个整数n和m。
 * <p>
 * 第二行包含n个整数，表示整数数列。
 * <p>
 * 接下来m行，每行包含两个整数l和r，表示一个询问的区间范围。
 * <p>
 * 输出格式
 * 共m行，每行输出一个询问的结果
 * @date 2020-09-26 15:30
 * <p>
 * 输入样例：
 * 5 3
 * 2 1 3 6 4
 * 1 2
 * 1 3
 * 2 4
 * 输出样例：
 * 3
 * 6
 * 10
 */
public class PreSum {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] strings = s.split(" ");
        int[] nums = new int[Integer.parseInt(strings[0])];
        String numString = reader.readLine();
        String[] numList = numString.split(" ");
        int[] sumList = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numList[i]);
            sumList[i] = (sum += nums[i]);
        }
        for (int i = 0; i < Integer.parseInt(strings[1]); i++) {
            String s1 = reader.readLine();
            int begin = Integer.parseInt(s1.split(" ")[0]);
            int end = Integer.parseInt(s1.split(" ")[1]);
            System.out.println(sumList[end - 1 ] - sumList[begin - 1] + nums[begin-1]);
        }


    }
}
