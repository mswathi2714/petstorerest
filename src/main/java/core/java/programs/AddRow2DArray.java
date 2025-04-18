package core.java.programs;

public class AddRow2DArray {
    public static int[][][] addFloor(int[][] original, int[][] newFloor) {
        int originalFloors = 1; // Since original is a 2D array, it has 1 floor
        int rows = original.length;
        int cols = original[0].length;

        // Create a new 3D array with an additional floor
        int[][][] newArray = new int[originalFloors + 1][rows][cols];

        // Copy the original floor to the new array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArray[0][i][j] = original[i][j];
            }
        }

        // Add the new floor to the new array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArray[1][i][j] = newFloor[i][j];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] newFloor = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][][] newArray = addFloor(original, newFloor);

        // Print the new 3D array
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Floor " + (i + 1) + ":");
            for (int j = 0; j < newArray[i].length; j++) {
                for (int k = 0; k < newArray[i][j].length; k++) {
                    System.out.print(newArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
