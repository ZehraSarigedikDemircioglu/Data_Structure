package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutionOptimal {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 8, 9, 10, 11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr, 5))); // [1, 0]
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr, 25))); // []
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}