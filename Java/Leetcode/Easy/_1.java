package com.Markurion.Leetcode;

import java.util.Arrays;

public class _1 {
    public static void main(String[] args){


        int[] arrray = {-1,-2,-3,-4,-5};
        int[] arr2 = {3,2,4};
        //Expected:
        //[2,4]

        System.out.println(Arrays.toString(twoSum(arrray,-8)));
        System.out.println(Arrays.toString(twoSum(arr2,6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int tabLength = nums.length;
        int temp = 0;

        int[] solution = new int[0];
        for (int x = 0; x < tabLength; x++) {
            temp = target - nums[x];
            for (int y = 0; y < tabLength; y++) {
                if (temp == nums[y] && x != y) {
                    solution = new int[]{x, y};
                }
            }
        }

        return solution;
    }


}
