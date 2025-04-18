package core.java.programs.Datastructures;

import java.util.*;

public class HashsetExample2 {
    public ArrayList<String> findAnagramWord(String[] array1, String[] array2) {
        HashSet<String> anagramsMatched = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        //Set<String> synchronizedSet = Collections.synchronizedSet(set1);
        ArrayList<String> result = new ArrayList<>();
        for (String s: array1) {
            set1.add(sortedCharacters(s));
        }
        for (String s2: array2){
            if(set1.contains(sortedCharacters(s2))) {
                if(!anagramsMatched.contains(s2)) {
                    result.add(s2);
                    anagramsMatched.add(s2);
                }
            }
        }
        return result;
    }

    public String sortedCharacters (String word) {
        String sortedCharactersWord = null;
        char[] char1 = word.toCharArray();
        Arrays.sort(char1);
        sortedCharactersWord = Arrays.toString(char1);
        return sortedCharactersWord;
    }

    public static void main(String[] args) {
        String[] list1 = {"dog","tub","mug","teacher","tub"};
        String[] list2 = {"saw","ear","bus","but","dog","gum"};
        HashsetExample2 hashsetExample2 =  new HashsetExample2();
        System.out.println(hashsetExample2.findAnagramWord(list1, list2)); // Outputs: OLLEH
    }
}
