package core.java.programs.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {return this.price;}

    public String toString() {
        return name + ": $" + price;
    }
}

class Solution {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>(
                Arrays.asList(
                        new Product("Milk", 2.99),
                        new Product("Bread", 1.99),
                        new Product("Eggs", 3.99)
                )
        );

        // Sorting the inventory by price in ascending order using Comparator.comparing
        inventory.sort(Comparator.comparing(Product::getPrice));

        System.out.println(inventory);
    }
}
