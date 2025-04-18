package core.java.programs.Datastructures;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.empty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("HELLO")); // Outputs: OLLEH
    }
}