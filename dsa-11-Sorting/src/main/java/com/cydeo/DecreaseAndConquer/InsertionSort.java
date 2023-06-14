package com.cydeo.DecreaseAndConquer;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        //  insertion sort = decrease by a constant

        int[] array = {4, 2, 9, -2, 5};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) { // the best = O(n) if already sorted, no shift, the worst = O(n^2)

        for (int i = 1; i < array.length; i++) {
            int toBeInserted = array[i]; // temp var toBeInserted
            int j = i - 1; // this is predecessor

            while (j >= 0 && toBeInserted < array[j]) { // go back and compare until ith < array[j]
                array[j + 1] = array[j]; // start shifting operation here
                j--;
            }
            array[j + 1] = toBeInserted;
        }
        return array;
    }
}
