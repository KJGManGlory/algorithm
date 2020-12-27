package com.lizza.BitOpt;

/**
 * 寻找数组中最多的元素
 * 摩尔投票法
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0, votes = 0;
        for (int num : nums) {
            // 票数等于 0, 则将当前元素作为众数
            if (votes == 0) result = num;
            // 如果众数依然是当前元素, 票数 +1
            votes += result == num ? 1 : -1;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,2,2,2,5,4,2,5,5,5,5,5,5,5,5,5,5,5};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));

    }
}
