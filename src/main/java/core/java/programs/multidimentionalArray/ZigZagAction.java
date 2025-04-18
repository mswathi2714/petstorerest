package core.java.programs.multidimentionalArray;

import java.util.Arrays;

public class ZigZagAction {
        public static int[] columnTraverse(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            String direction = "up";
            int row = rows - 1;
            int col = cols - 1;
            int[] output = new int[rows * cols];
            int index = 0;

            while (index < rows * cols) {
                output[index++] = matrix[row][col];

                if (direction.equals("up")) {
                    if (row - 1 < 0) {
                        direction = "down";
                        col -= 1;
                    } else {
                        row -= 1;
                    }
                } else {
                    if (row + 1 == rows) {
                        direction = "up";
                        col -= 1;
                    } else {
                        row += 1;
                    }
                }
            }

            return output;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };

            int[] result = columnTraverse(matrix);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

}
