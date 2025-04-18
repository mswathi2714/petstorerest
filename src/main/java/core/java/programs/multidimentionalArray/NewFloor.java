package core.java.programs.multidimentionalArray;

import java.util.Arrays;

import java.util.Arrays;

public class NewFloor {
    public static void main(String[] args) {
        // Initializing a 2D array that represents an apartment building
        String[][] apartments = {
                {"Apt 101", "Apt 102"},
                {"Apt 201", "Apt 202"}
        };

        // Adding a new floor to the apartment building
        apartments = addNewFloor(apartments, new String[]{"Apt 301", "Apt 302"});

        // TODO: Make a walk visiting each apartment on every floor of the updated building.
        for (String[] apts : apartments) {
            for (String apt2 : apts) {
                System.out.print(apt2 + " ,");
            }
            System.out.println(" ");

        }
        // TODO: Add a method `addNewFloor` to add a new floor with apartments to our 'apartment building'.
    }


    private static String[][] addNewFloor(String[][] apartments, String[] newfloor) {
        String[][] newApts = new String[apartments.length + 1][];
        for (int i = 0; i < apartments.length; i++) {
            newApts[i] = Arrays.copyOf(apartments[i], apartments.length);

        }
        newApts[2] = newfloor;
        return newApts;

    }

}
