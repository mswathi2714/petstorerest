package core.java.programs.Datastructures;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
class Employee {
    private String name;
    private String lastname;

    public String getLastname() {
        return lastname;
    }


    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

   @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Charlie", "Brown"),
                new Employee("Alice", "Brown"),
                new Employee("CBob", "Johnson")
        );
        List<String> list1 = employees.stream()
                .flatMap(f -> Stream.of(f.getName()+" "+f.getLastname(), f.getName())).toList();
        System.out.println("Sorted List1" + list1);

        List<Employee> list2 = employees.stream()
                .sorted((a,b) -> b.getLastname().compareTo(a.getLastname())).toList();
        System.out.println("Sorted List2" + list2);

        List<String> newList = employees.stream().filter(e -> e.getName().endsWith("e")).flatMap(fm -> Stream.of(fm.getName(), fm.getLastname())).toList();
        System.out.println("Filtered Cars with flatmap: " + newList);


        List<String> newList2 = employees.stream().filter(x -> x.getLastname().endsWith("n")).map(Employee::getName).toList();
        System.out.println("Filtered Cars with map: " + newList2);


        // Sort employees by name
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getLastname));

        // Print sorted employees
        employees.forEach(System.out::println);
    }
}
