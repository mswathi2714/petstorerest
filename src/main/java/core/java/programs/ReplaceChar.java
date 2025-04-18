package core.java.programs;

public class ReplaceChar {
    public String replaceCharacter(String inputString, char c1, char c2) {
        char[] c3 = inputString.toCharArray();
        char[] c4 = new char[c3.length];
        for(int i= 0; i< inputString.length(); i++) {
            char s = c3[i];
            if(Character.isAlphabetic(s)) {
                if (s == c1) {
                    c4[i] = c2;
                } else {
                    c4[i] = s;
                }
            }  else {
                c4[i] = s;
            }
        }
        return new String(c4);
    }
    public static void main(String [] args) {
        ReplaceChar sol = new ReplaceChar();
        String output = sol.replaceCharacter("mississippi", 's', '$');
        System.out.print("New string "+ output);
    }
}
