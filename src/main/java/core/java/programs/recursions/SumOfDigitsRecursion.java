package core.java.programs.recursions;

public class SumOfDigitsRecursion {
    public static int sumOfDigits(int num){
        if( num < 10){
            return num;
        } else {
            int  result = num % 10 + sumOfDigits(num/10);
            System.out.println(result);
            return result;
        }
    }
    public static void main(String[] args){
        System.out.println(sumOfDigits(639));
    }
}
