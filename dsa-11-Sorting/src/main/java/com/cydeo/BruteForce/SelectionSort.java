package com.cydeo.BruteForce;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {4, 2, 9, -2, 5};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
    public static int[] selectionSort(int[] array) { // the best = O(n^2), the worst = O(n^2)

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
        return array;
    }

    public static void swap(int[] array, int idx1, int idx2) {

        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
