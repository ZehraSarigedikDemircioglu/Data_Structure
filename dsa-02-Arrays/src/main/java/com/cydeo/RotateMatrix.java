package com.cydeo;

public class RotateMatrix {

    public static void main(String[] args) {

        // This service class has two methods one of which rotates a nxn matrix 90 degrees in-place.

        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotate90(matrix);
        rotate90(matrix2);

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

    public static void rotate90(int[][] matrix) {

        int n = matrix.length;
        printMatrix(matrix);
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top


                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                printMatrix(matrix);
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                printMatrix(matrix);
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                printMatrix(matrix);
                // top -> right
                matrix[i][last] = top; // right <- saved top
                printMatrix(matrix);
            }
        }
    }
}
