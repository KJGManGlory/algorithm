package com.lizza.QuickSort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivot = array[l];

        while (l <= r) {
            while (array[l] < pivot) l++;
            while (array[r] > pivot) r--;
            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }
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
