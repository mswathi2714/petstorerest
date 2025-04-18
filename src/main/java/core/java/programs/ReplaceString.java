package core.java.programs;

public class ReplaceString {
    public String shiftByOneCharacter(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            System.out.println("Original Character-"+ c);
            if (Character.isAlphabetic(c))
            {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'A';
                } else {
                    c = (char) (c + 1);
                }
                System.out.println("Next Character-"+ c);
                result.append(c);
            } else {
               result.append(c);
            }
        }
        System.out.println("resulted String-"+ result);
        return result.toString();
    }
    public static void main(String [] args) {
        ReplaceString replaceString = new ReplaceString();
        String result = replaceString.shiftByOneCharacter("abc123XYz!");
        System.out.println(result);
    }
}