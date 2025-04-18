package core.java.programs.multidimentionalArray;

public class TraverseArray {
    public static void main(String[] args) {

        String[][] array = {
                {"apt101", "apt102", "apt103"},
                {"apt201", "apt202", "apt203"},
                {"apt301", "apt302", "apt303"}
        };

        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string +", ");
            }
            System.out.println(" ");
        }
    }
}
