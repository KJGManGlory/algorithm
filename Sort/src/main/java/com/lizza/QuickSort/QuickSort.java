package com.lizza.QuickSort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        // 选取基准
        int pivot = array[l];

        while (l <= r) {
            // 从左边开始遍历, 找到第一个比基准大的元素
            while (array[l] < pivot) l++;
            // 从右边开始遍历, 找到第一个比基准小的元素
            while (array[r] > pivot) r--;
            // 将上面步骤中找到的比基准大的元素与比基准小的元素进行交换
            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }
        // 如果 l 和 r 重合了, 则对分区进行继续查找的工作
        if (left < r) quickSort(array, left, r);
        if (l < right) quickSort(array, l, right);
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args){
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
