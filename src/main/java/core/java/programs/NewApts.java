package core.java.programs;

import java.util.Arrays;

class NewApts {
    public static void main(String[] args) {
        // Initializing a 2D array that represents an apartment building
        String[][] apartments = {
                {"Apt 101", "Apt 102"},
                {"Apt 201", "Apt 202"}
        };

        // Adding a new floor to the apartment building
        apartments = addNewFloor(apartments, new String[]{"Apt 301", "Apt 302"});

        // TODO: Make a walk visiting each apartment on every floor of the updated building.
        // Print the new 3D array
        for (int i = 0; i < apartments.length; i++) {
            System.out.println("Floor " + (i + 1) + ":");
            for (int j = 0; j < apartments[i].length; j++) {
                System.out.print(apartments[i][j] + " ");
            }
            System.out.println();
        }
    }


    // TODO: Add a method `addNewFloor` to add a new floor with apartments to our 'apartment building'.
    public static String[][] addNewFloor(String[][] apts, String[] newFloor) {
        int rows = apts.length+1;
        int cols = apts[0].length;
        String[][] updatedApts = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < 2) {
                    updatedApts[i][j] = apts[i][j];
                }
                /*(else {
                    updatedApts[i][j] = newFloor[j];
                }*/
            }
        }
        updatedApts[2][0] = newFloor[0];
        updatedApts[2][1] = newFloor[1];

        System.out.println("New array: "+ updatedApts.length);

        System.out.println("New array: "+ Arrays.deepToString(updatedApts));
        return updatedApts;
    }
}