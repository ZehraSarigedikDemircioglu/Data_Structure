package com.cydeo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(uniqueNumberOccurrence(arr)); // true
        System.out.println(uniqueNumberOccurrence(arr2)); // false
        System.out.println(uniqueNumberOccurrence(arr3)); // true


    }

    public static boolean uniqueNumberOccurrence(int[] array) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int each : array) {
            frequency.put(each, frequency.getOrDefault(each, 0) + 1);
        }

        // put freq in a set if there are any duplicated values
//        Set<Integer> freqSet = new HashSet<>();
//        for (Integer each : frequency.values()) {
//            if(!freqSet.add(each)){
//                return false;
//            }
//        }
//        return true;
        HashSet<Integer> freqSet = new HashSet<>();
        for (Integer eachValue : frequency.values()) {
            freqSet.add(eachValue);
        }

        return frequency.size() == freqSet.size();
    }
}
/*
Given an array of integers arr, return true if the number of occurrences of each
value in the array is unique or false otherwise
 */
