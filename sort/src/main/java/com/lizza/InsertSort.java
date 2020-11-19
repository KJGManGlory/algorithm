package com.lizza;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void insertSort(int[] array) {
        if (array == null || array.length == 0) return;
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args){
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
