package com.cydeo;

import java.util.Arrays;

public class TwoSumSolution {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 8, 9, 10, 11}; // sorted array
        System.out.println(Arrays.toString(twoSumSolution(arr, 5))); // [0, 1]
        System.out.println(Arrays.toString(twoSumSolution(arr, 25))); // []
    }

    // Bruteforce Solution of Two Sum problem.
    public static int[] twoSumSolution(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetValue) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
