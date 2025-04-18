package core.java.programs.Datastructures;

import java.util.HashSet;

class HashSetExample3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        // Add elements to HashSet
        for(int i = 0; i < 1000; i++){
            set.add("element_" + i);
        }

        // Find elements in HashSet
        for(int i = 0; i < 1000; i++){
            set.contains("element_" + i);
        }

        // Remove elements from HashSet
        for(int i = 0; i < 1000; i++){
            set.remove("element_" + i);
        }
        HashSet<String> visitedPages = new HashSet<String>();

        // Impersonate a user visiting pages
        visitedPages.add("https://example.com");
        visitedPages.add("https://codesignal.com");

        // Check if a user accessed https://codesignal.com before
        if (visitedPages.contains("https://codesignal.com")) {
            System.out.println("The user visited https://codesignal.com before");
        }
    }
}
