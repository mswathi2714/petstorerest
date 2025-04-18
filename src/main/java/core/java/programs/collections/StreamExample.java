package core.java.programs.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
       // List<Integer> newlist = new ArrayList<>(Arrays.asList(1, 2, 3));


        String str = "Hello, World!";
        IntStream intStream = str.chars();
        intStream.forEach(System.out::println);

        List<String> strList = List.of("apple", "banana", "cherry", "date", "elderberry", "date", "fig", "grape", "apple", "banana");
        boolean b = strList.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("Any match starts with a: " + b);

        //strList.sort(Comparator.comparing(String::length));

        List<String> duplicates = strList.stream()
                .filter(s -> strList.stream().filter(s::equals).count() > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicates: " + duplicates);

        List<String> duplicates2 = strList.stream().collect(
                Collectors.groupingBy(s-> s, Collectors.counting()))
                .entrySet().stream().filter(k -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicates2: " + duplicates2);
    }
}
