package core.java.programs.multidimentionalArray;

import java.util.Arrays;

class Print2DArray {
    public static void main(String[] args) {
        // Creating a 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing the 2D array
        System.out.println(Arrays.deepToString(array));
    }
}