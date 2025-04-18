package core.java.programs.Datastructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> books =  new HashMap<>();
        String[] list1 = {"dog","tub","mug","teacher","tub"};
        String[] list2 = {"saw","ear","bus","but","dog","gum"};
        books.put("World34", 1456);
        books.put("World", 2);

        int sum=0;
        for(String bookKey: books.keySet()) {
            sum+=books.get(bookKey);
        }
        System.out.println(sum);
        System.out.println(books.getOrDefault("World4645",2));
       // System.out.println(books.get("World"));
    }
}
