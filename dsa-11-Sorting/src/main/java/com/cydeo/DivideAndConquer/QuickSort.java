package com.cydeo.DivideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {4, 2, 9, -2, 5};

        quickSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int indexStart, int indexEnd) { // the best = O(nlogn), the worst = O(n^2)

        if (indexStart >= indexEnd) return; // termination
        int boundary = partition(array, indexStart, indexEnd);
        quickSort(array, indexStart, boundary - 1); // call quickSort for left part
        quickSort(array, boundary + 1, indexEnd); // call quickSort for right part
    }

    public static int partition(int[] array, int start, int end) {

        int pivot = array[end]; // choose pivot as the last element for the partition
        int boundary = start;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot){
                swap(array, i, boundary++);
            }
        }
        return boundary - 1;
    }

    public static void swap(int[] array, int idx1, int idx2) {

        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
