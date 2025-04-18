package core.java.programs.Datastructures;

import java.util.HashSet;

class HashSetExample {
    public static void main(String args[]) {
        // Instantiate a HashSet
        HashSet<String> set=new HashSet<String>();

        // Add elements to HashSet
        set.add("David");
        set.add("Alice");
        set.add("Bob");
        set.add("Alice");
        set.add(null);

        Object a = new Integer(1);
        Object b = new Integer(2);
        System.out.println(a.equals(b));

        System.out.println(set);  // prints [Bob, Alice, David]
        System.out.println(set.size());  // prints 3
    }
}