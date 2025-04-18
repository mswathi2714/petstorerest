package core.java.programs.StreamsAPI;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class Car {
    String name;
    int price;
    String color;
    String model;
    String make;
    /*public Car(String name, int price, String color, String model, String make) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.model = model;
        this.make = make;
    }*/
}
public class StreamsExample {
    //record Car(String name, int price , String color, String model, String make) {}

    public static void main (String [] args) {
        List<Car> cars = List.of(
                new Car("BMW", 10000, "Black", "2020", "Sedan"),
                new Car("Audi", 20000, "White", "2021", "Sedan"),
                new Car("Mercedes", 30000, "Red", "2022", "Sedan"),
                new Car("Toyota", 40000, "Blue", "2023", "Hatchback"),
                new Car("Honda", 50000, "Green", "2024", "Hatchback")
        );
        List<Car> filteredCars = cars.stream().filter(car-> car.getColor().equals("Green")).collect(Collectors.toList());
        filteredCars.forEach(e-> System.out.println(e.name+ " "+e.color + " "+e.price +  " "+e.model + " "+e.make));

        //filter cars using partitioningBy
        Map<Boolean, List<Car>> map = cars.stream().collect(Collectors.partitioningBy(x->x.getMake().equals("Sedan")));
        System.out.println("Partitioned Cars: " + map);

        //filter cars using <type , <make, count>>
        Map<String ,Map<String , Integer>> map2 = cars.stream().collect(
                groupingBy(Car::getMake, groupingBy(Car::getName, Collectors.summingInt(e->1))));
        System.out.println("Grouped Cars: " + map2);

        //Filter cars <make, <name, price>>  using toMap
        Map<String , Map<String, Integer>> map3 =  cars.stream().collect(
                groupingBy(Car::getMake, toMap(Car::getName, Car::getPrice))

        );
        System.out.println("Grouped Cars3" + map3);

        //Filter cars using ParallelStream
        cars.parallelStream().forEach(System.out::println);
        cars.parallelStream().sequential().forEach(System.out::println);


        //filter cars based on model year greater than 2020
        List<Car> filteredCars2 = cars.stream().filter(car -> Integer.parseInt(car.getModel())>2020).collect(Collectors.toList());
        filteredCars2.forEach(c-> System.out.println(c.name+ " "+c.color + " "+c.price +  " "+c.model + " "+c.make));
       // List<String, Integer> newList = filteredCars2.stream().map(e-> List.of(e.getName(), e.getPrice())).toList();

        //Filter cars using parallelStream
        Map<String , Map<String, String>> map4 = filteredCars2.parallelStream()
                .filter(r->r.getMake().equals("Hatchback")).collect(Collectors.toMap(
                        Car::getName, car-> Map.of(car.getModel(), car.getColor())
                ));
        System.out.println("Filtered Cars4: " + map4);

        // filter cars based on color and name using Flatmap
        List<String> newList2 = filteredCars2.stream().flatMap(e-> Stream.of(e.getName(),e.getColor())).toList();
        System.out.println("Filtered Cars with flatmap: " + newList2);


        //filter car prices greater than 20000
        List<Integer> prices = filteredCars2.stream().map(car -> car.getPrice())
                .filter(filteredCar-> filteredCar.intValue()>20000).collect(Collectors.toUnmodifiableList());
        System.out.println("Filtered Prices:" +prices);

        Stream <String> stream = Stream.of("AB", "BD", "AC", "DE");
        Stream<String> s2 = stream.filter(s-> s.startsWith("A"));
        System.out.println("Filtered Cars" + s2.count());
       // After terminal operations like above stream will be closed and we cannot use it again
        Stream <String> inputStream = Stream.of("Hello", "Hallow", "Howey", "Accent","Aroma");
        Stream<String> s3 = inputStream.filter(s-> s.startsWith("H")).map(
                s-> {
                    System.out.println("Mapping: " + s);
                    return  s.toLowerCase();
                }
        );
        System.out.println("Cars in stream: " + s3.toList());

    }
}
