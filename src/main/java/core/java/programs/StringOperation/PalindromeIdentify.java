package core.java.programs.StringOperation;

public class PalindromeIdentify {
    public boolean isPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            // Move left index to the next letter character
            while (left < right && !Character.isLetter(inputString.charAt(left))) {
                left++;
            }
            // Move right index to the previous letter character
            while (left < right && !Character.isLetter(inputString.charAt(right))) {
                right--;
            }
            // Compare characters ignoring case
            if (Character.toLowerCase(inputString.charAt(left)) != Character.toLowerCase(inputString.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeIdentify sol = new PalindromeIdentify();
        boolean output = sol.isPalindrome("level");
        System.out.print(" Is palindrome " + output);
    }
}
