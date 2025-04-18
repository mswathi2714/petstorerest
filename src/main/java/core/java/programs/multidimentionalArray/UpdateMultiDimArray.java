package core.java.programs.multidimentionalArray;

import java.util.Arrays;

public class UpdateMultiDimArray {
    public static void main(String[] args) {
        String[][] cities = {
                {"NYC", "JERSEY", "EDISON"},
                {"CHARLOTTE", "MONROE", "RALEIGH"},
                {"CHARLESTON", "MURTLEBEACH", "WILMINGTON"}

        };
        cities[2][1] ="JACKSONVILLE";
        for (String[] displayCities : cities) {
            for (String finalCities : displayCities) {
                System.out.print(finalCities + ", ");
            }
            System.out.println(" ");
        }
    }
}
