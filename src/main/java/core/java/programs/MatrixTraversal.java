package core.java.programs;
// Matrix involved traversing even-indexed columns downwards  and odd-indexed columns upwards.
class MatrixTraversal {
    public static void printMatrixTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int col = cols - 1; col >= 0; --col) {
            if (col % 2 != 0) {
                for (int row = rows - 1; row >= 0; --row) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                for (int row = 0; row < rows; ++row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrixTraversal(matrix);
    }
}
