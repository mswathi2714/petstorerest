package core.java.programs.multidimentionalArray;

import java.util.Arrays;

public class AddNewRow {
    public static void main (String[] args)
    {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] newArray = new int[array.length+1][array[0].length+1];
        for (int i=0;i< array.length;i++){
            newArray[i] = Arrays.copyOf(array[i], array.length);
        }
        newArray[3] = new int[]{23,33,44,55};
        System.out.println(Arrays.deepToString(newArray));
    }
}
