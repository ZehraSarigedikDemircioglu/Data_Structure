package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {

    public static void main(String[] args) {

        int[] arr = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}; // [0, 7]
        int[] arr2 = {1, 3, 4, 5, 6, 10, 11, 12, 17}; // [3, 6]
        int[] arr3 = {7, 3, 12, 4, 1, 2}; // [1, 4]
        int[] arr4 = {6, 5, 4, 3, 2, 1, 0}; // [0, 6]

        System.out.println(Arrays.toString(largestRange(arr)));
        System.out.println(Arrays.toString(largestRange(arr2)));
        System.out.println(Arrays.toString(largestRange(arr3)));
        System.out.println(Arrays.toString(largestRange(arr4)));

    }

    public static int[] largestRange(int[] array) {

        int[] bestRange = new int[2];
        int longestRange = 0;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int each : array) {
            map.put(each, true);
        }
        for (int each : array) {
            if (!map.get(each)) { // that element has not visited yet
                continue;
            }
            int currentLength = 1;
            int left = each - 1;
            int right = each + 1;

            while (map.containsKey(left)) { // find the left edge of this current value each
                map.put(left, false);
                currentLength++;
                left--;
            }
            while (map.containsKey(right)) { // find the right edge of this current value each
                map.put(right, false);
                currentLength++;
                right++;
            }
            if (currentLength > longestRange) {
                longestRange = currentLength;
                bestRange = new int[]{left + 1, right - 1};
            }
        }
        return bestRange;
    }
}
/*
Write a function that takes in an array of integers and returns an array of length 2 representing the largest
range of integers contained in that array. The first number in the output array should be the first number in
the range, while the second number should be the last number in the range. A range of numbers is defined as
a set of numbers that come right after each other in the set of real integers. For instance, the output array [2,
6] represents the range {2, 3, 4, 5, 6}, which is a range of length 5. Note that numbers don't need to be sorted
or adjacent in the input array in order to form a range. You can assume that there will only be one largest
range.
 */
