package core.java.programs;

import java.util.Arrays;

class Rotate2DMatrix {
    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        System.out.println("Transpose the matrix :" +Arrays.deepToString(matrix));
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp1 = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp1;
            }
        }
        System.out.println("Reversed matrix" + Arrays.deepToString(matrix));
        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("rotated matrix" + Arrays.deepToString(matrix));
        return matrix;

    }


    public static void main(String[] args) {
        Rotate2DMatrix sol = new Rotate2DMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Input matrix : " + Arrays.deepToString(matrix));
        int[][] matrixOutput = sol.rotate(matrix);
        System.out.println(Arrays.deepToString(matrixOutput));
    }
}