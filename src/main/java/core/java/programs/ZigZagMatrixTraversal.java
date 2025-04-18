package core.java.programs;

import java.util.ArrayList;

public class ZigZagMatrixTraversal {
        public static int[] columnTraverse(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            boolean goUp = true;
            int row = rows - 1;
            int col = cols - 1;
            int[] output = new int[rows * cols];
            int index = 0;
             for(int i=col; i>=0 ;i--) {
                if(goUp) {
                    for(int j=row; j>=0; j--) {
                        output[index++] = matrix[j][i];
                    }
                    goUp= false;
                } else{
                    for(int j=0; j<=row; j++) {
                        output[index++] = matrix[j][i];
                    }
                    goUp = true;
                }
             }
            return output;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[] result = columnTraverse(matrix);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

