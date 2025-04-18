package core.java.programs.recursions;

public class CountEventDigits {
    // Function to count the number of even digits in a number using recursion
    static int countEvenDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                return 1 + countEvenDigits(num / 10);
            } else {
                return countEvenDigits(num / 10);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The number of even digits in 7623: " + countEvenDigits(7623));
    }
}
