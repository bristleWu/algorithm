package com.bristle.pointercollision;

/**
 * @author yixuanWu
 * @version 1.0
 * @description 最大连续字符串
 * @date 2020-09-28 21:12
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int j = 0, res = 0;
        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
            while(chars[s.charAt(i)] > 1) {
                chars[s.charAt(j++)]--;
            }
            res = Math.max(res,i - j + 1);
        }
        return res;
    }
}
