package core.java.programs.StringOperation;

public class SwapPairs {
    public String swapPairs(String s) {
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length - 1; i += 2) {
            char temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
        return new String(input);
    }
    public static void main(String [] args) {
        SwapPairs sol = new SwapPairs();
        String output = sol.swapPairs("abcdef");
        System.out.println("New string "+ output);

        String output2 = sol.swapPairs("oscar");
        System.out.println("New string "+ output2);
    }
}
