package com.lizza.Queue;

import java.util.Arrays;

/**
 * 滑动窗口的最大值
 * 给定一个数组 nums 和滑动窗口的大小 k, 请找出所有滑动窗口里的最大值
 */
public class MaxSlidingWindow {

    public static void main(String[] args){
//        int[] array = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int[] array = new int[] {1};
        int[] result = maxSlidingWindow(array, 1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        for (int start = 0, end = k - 1; end < nums.length; start++, end++) {
            int max = nums[start];
            for (int i = start; i <= end; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            result[start] = max;
        }
        return result;
    }
}
