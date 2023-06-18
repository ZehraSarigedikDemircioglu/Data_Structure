package com.cydeo;

public class FindKthLargest {

    public static void main(String[] args) {

        int[] array = {4, 2, 9, -2, 5};
        System.out.println(findKthLargest(array, 5));
        System.out.println(findKthLargest(array, 4));
        System.out.println(findKthLargest(array, 3));
        System.out.println(findKthLargest(array, 2));
        System.out.println(findKthLargest(array, 1));

    }

    public static int findKthLargest(int[] array, int k){

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array[array.length - k];
    }
    public static void swap(int[] array, int idx1, int idx2) {

        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
