package com.lizza.Array;

import java.util.Arrays;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2021-01-08
 */
public class PrintNumbers {

    public static void main(String[] args){
        System.out.println(Arrays.toString(printNumbers(1)));
    }

    public static int[] printNumbers(int n) {
        if (n == 0) return new int[0];
        int max = 1;
        for (int i = 1; i <= n; i++) {
            max = max * 10;
        }
        int[] result = new int[max - 1];
        for (int i = 0; i < max - 1; i++) {
            result[i] = (i + 1);
        }
        return result;
    }
}
