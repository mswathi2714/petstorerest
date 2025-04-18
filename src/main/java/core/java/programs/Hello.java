package core.java.programs;

public class Hello {
    public String transformString(String inputString) {
        String newValue = "Hello World 123";
        char[] c2 = newValue.toCharArray();
        char[] result = new char[c2.length];
        for (int i = 0; i < c2.length; i++) {

                if (Character.isAlphabetic(c2[i])) {
                    if (Character.isLowerCase(c2[i])) {
                        result[i] = Character.toUpperCase(c2[i]);
                    } else if (Character.isUpperCase(c2[i])) {
                        result[i] = Character.toLowerCase(c2[i]);
                    }
                } else {
                    result[i] = c2[i];
                }
            }
            return new String(result);
    }
    public static void main(String[] args){
        Hello sol = new Hello();
        String s = "Hello";
        char[] newArray = s.toCharArray();
        String newValue = sol.transformString("Hello World 123");
    }
}