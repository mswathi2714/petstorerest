package core.java.programs;

import java.util.Arrays;

class TransposeMatrix {

    public static int[][] transformMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0][0];

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        // TODO: Modify the loop to transpose the matrix in reverse order
       // output - [[104, 204, 304], [103, 203, 303], [102, 202, 302], [101, 201, 301]]
       /* int k=0;
        for (int j=cols-1;j>=0;j--) {
            int l=0;
            for (int i=0;i<=rows-1;i++) {
                // transposed[k][l] = matrix[i][j];
                transposed[k][i] = matrix[i][j];
                System.out.println("[i][i]"+ matrix[i][j]);
                l++;
            }
            k++;
        }*/

       //output -[[304, 204, 104], [303, 203, 103], [302, 202, 102], [301, 201, 101]]
        int k=0;
        for (int j=cols-1;j>=0;j--) {
            int l=0;
            for (int i=rows-1;i>=0;i--) {
                transposed[k][l] = matrix[i][j];
                System.out.println("[i][i]"+ matrix[i][j]);
                l++;
            }
            k++;
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] seatingChart = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304}
        };

        // TODO: Store the result of transformMatrix in transposedSeating and print it
        int[][] output = transformMatrix(seatingChart);
        System.out.println(Arrays.deepToString(output));
        System.out.println("");

    }
}