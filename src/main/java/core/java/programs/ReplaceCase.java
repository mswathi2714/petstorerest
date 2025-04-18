package core.java.programs;


public class ReplaceCase {
    public String transformString(String inputString) {
        StringBuilder builder = new StringBuilder();
        for(int i= 0; i< inputString.length(); i++){
            char c = inputString.charAt(i);
            if(Character.isAlphabetic(c)) {
                if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                } else if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                builder.append(c);

            } else {
                builder.append(c);
            }
        }
        System.out.println(" Transformed string "+ builder.toString());
        return builder.toString();
    }
    public static void main(String[] args){
        ReplaceCase sol = new ReplaceCase();
        String newValue ="Hello World 123";
        char[] c2 = newValue.toCharArray();
        char[] result = new char[c2.length];
        for (int i= 0; i< c2.length; i++){ {
            if (Character.isAlphabetic(c2[i])) {
                if (Character.isLowerCase(c2[i])) {
                    result[i] = Character.toUpperCase(c2[i]);
                } else if (Character.isUpperCase(c2[i])) {
                    result[i] = Character.toLowerCase(c2[i]);
                }
            } else {
                result[i]= c2[i];
            }
        }
        }
        System.out.println("New String"+ new String(result));
    }
}
