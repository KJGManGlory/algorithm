package com.lizza;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * 1. 从第一个元素开始, 依次比较相邻的两个元素, 如果第一个元素比第二个大, 则进行交换, 直至最后一个元素
 * 2.
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        // 1. 外层循环控制次数, 内层循环进行元素比较和位置交换
        // 2. 内层循环中 j - i 是为了减少循环次数, 因为每次外层循环都会将最大的数字冒泡到最后的位置
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
