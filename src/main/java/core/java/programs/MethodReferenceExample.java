package core.java.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression
        names.forEach(name -> System.out.println(name));

        // Using a method reference (equivalent to the lambda expression above)
        names.forEach(System.out::println);

        // Static method reference
        Function<Integer, String> intToString = String::valueOf;
        System.out.println(intToString.apply(123));

        // Instance method reference of a particular object
        String greeting = "Hello";
        Function<String, String> greet = greeting::concat;
        System.out.println(greet.apply(" World!"));

        // Instance method reference of an arbitrary object of a particular type
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.sort(Comparator.comparing(String::length));
        words.sort(String::compareToIgnoreCase);
        System.out.println(words);

        // Constructor reference
        Function<String, Person> personCreator = Person::new;
        Person john = personCreator.apply("John Doe");
        System.out.println(john.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
