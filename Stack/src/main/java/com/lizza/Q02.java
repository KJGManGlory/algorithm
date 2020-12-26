package com.lizza;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-11
 */
public class Q02 {

    public static void main(String[] args){
        int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height = 1;
        for (int i : array) {
            if (i > height)
                height = i;
        }
        int temp = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < array.length; j++) {
                int e = array[j];
                if (e >= j) {
                    temp += 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= height; j++) {

            }

        }
    }
}
