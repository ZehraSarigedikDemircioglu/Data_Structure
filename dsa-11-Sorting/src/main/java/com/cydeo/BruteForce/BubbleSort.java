package com.cydeo.BruteForce;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {4, 2, 9, -2, 5};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
    public static int[] bubbleSort(int[] array) { // the best = O(n) if already sorted, no swap, the worst = O(n^2)

        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swap = true;
                }
            }
            if (!swap){
                return array;
            }
        }
        return array;
    }
    public static void swap(int[] array, int idx1, int idx2) {

        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
