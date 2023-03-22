package com.cydeo;

public class PrintMatrix {
    // Method just prints the matrix on the console.

    public static void main(String[] args) {

        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printMatrix(matrix);
        printMatrix(matrix2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                    System.out.print(" ");
                }
                if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                    System.out.print(" ");
                }
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
