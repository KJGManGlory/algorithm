package com.lizza.BitOpt;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-26
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n & 1;
            n >>>= 1;
        }

        return result;
    }

    public static void main(String[] args){
        HammingWeight hammingWeight = new HammingWeight();
        int result = hammingWeight.hammingWeight(00000000000000000000000000001011);
        System.out.println(result);
    }
}
