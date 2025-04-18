package core.java.programs.Datastructures;
import java.util.HashSet;

class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        // Add elements to HashSet
        for(int i = 0; i < 100; i++){
            set.add(i);
        }

        // Access all elements
        for(int i = 0; i < 100; i++){
            if(set.contains(i)) {
                System.out.println(i + " found");
            }
        }
    }
}
