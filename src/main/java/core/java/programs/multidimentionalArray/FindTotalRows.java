package core.java.programs.multidimentionalArray;

public class FindTotalRows {
    public static void main (String[] args) {
    int[][] numbers = {
            {11,22,33},
            {44,55,66},
            {77,88,99}
    };
    System.out.println("Total rows in the array: " + numbers.length);
    System.out.println("Total columns in the array: " + numbers[0].length);

    }
}
