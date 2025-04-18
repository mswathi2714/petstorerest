package core.java.programs.multidimentionalArray;

public class BreakOrContinueLoop {
        public static void main(String[] args) {
            String[][] array = {
                    {"Apt 101", "Apt 102", "Apt 103"},
                    {"Apt 201", "Exit Floor", "Apt 203"},
                    {"Apt 301", "Apt 302", "Apt 303"}
            };

            // Break in nested loop
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals("Exit Floor")) {
                        break;
                    }
                    System.out.print(array[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }

