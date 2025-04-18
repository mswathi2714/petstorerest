package core.java.programs.StringOperation;

import java.util.Arrays;

public class Palindrome {
    public boolean isPalindrome(String inputString) {
        char[] input = inputString.toCharArray();
        char[] input2 = new char[input.length];
        int n = input.length-1;
        for (int i=0; i <= n; i++) {
            input2[n-i]= input[i];
        }
        if (Arrays.equals(input, input2)) {
            System.out.print(" Is palindrome "+ true);
            return true;
        }
        System.out.print("New string "+ new String(input2));
        return false;
    }
    public static void main(String [] args) {
        Palindrome sol = new Palindrome();
        boolean output = sol.isPalindrome("level");
        System.out.print(" Is palindrome:  "+ output);

    }
}