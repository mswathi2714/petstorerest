package core.java.programs.StringOperation;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(100);
    }
    public static String[] fizzbuzz(int n) {
        String [] actualOutput = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                actualOutput[i - 1] = "FizzBuzz";
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                actualOutput[i - 1] = "Fizz";
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                actualOutput[i - 1] = "Buzz";
                System.out.println("Buzz");
            } else {
                actualOutput[i - 1] = String.valueOf(i);
                System.out.println(i);
            }
        }
        return actualOutput;
    }
}