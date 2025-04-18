package core.java.programs.StringOperation;

import java.util.ArrayList;
import java.util.List;

public class FindVowels {
    public List<Integer> solution(String s) {
        Character[] vowels = {'a','e','i','o','u', 'A','E','I','O','U'};
        List<Integer> positions = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for (Character vowel : vowels) {
                if(s.charAt(i) == vowel){
                    positions.add(i);
                    break;
                }
            }

        }
        return positions;
    }
    public static void main(String[] args) {
        FindVowels findVowels = new FindVowels();
        List<Integer> positions = findVowels.solution("swathi");
        System.out.println(positions);
    }
}



