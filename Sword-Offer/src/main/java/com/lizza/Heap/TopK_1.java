package com.lizza.Heap;

import java.util.Arrays;

/**
 * 快排解决 TopK 问题
 */
public class TopK_1 {

    public static void quickSort(int[] array, int left, int right) {
        int l = left, r = right, pivot = array[l];

        while (l <= r) {
            while (array[l] < pivot) l++;
            while (array[r] > pivot) r--;
            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }

        if (l < right) quickSort(array, l, right);
        if (r > left) quickSort(array, left, r);
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
           result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};


        System.out.println(Arrays.toString(getLeastNumbers(array, 5)));
    }
}
