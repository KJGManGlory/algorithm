package com.lizza.QuickSort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        int target = array[0];

        while (array[left] >= target && left <= right) left++;
        while (array[right] <= target && left <= right) right--;

        swap(array, left, right);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 按位异或计算进行数据交换: 7, 3
     * 7:   0111
     * 3:   0011
     * L    0111 ^ 0011 = 0100  4
     * R    0100 ^ 0011 = 0111  7
     * L    0100 ^ 0111 = 0011  3
     */
    private static void swap(int[] array, int left, int right) {
        array[left] = array[left] ^ array[right];
        array[right] = array[left] ^ array[right];
        array[left] = array[left] ^ array[right];
    }

    public static void main(String[] args){
//        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] array = {3, 2, 5};
        quickSort(array, 0, array.length - 1);

    }
}
