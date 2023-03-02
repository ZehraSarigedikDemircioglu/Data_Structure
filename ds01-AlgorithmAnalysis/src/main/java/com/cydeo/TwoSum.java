package com.cydeo;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSumNumber(nums, 9))); // [0, 1]
        System.out.println(Arrays.toString(twoSumNumber(nums, 8))); // [-1, -1]

    }

    public static int[] twoSumNumber(int[] nums, int targetValue) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetValue) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
/*
Is the array sorted? No
No duplicated values accepted
 */

