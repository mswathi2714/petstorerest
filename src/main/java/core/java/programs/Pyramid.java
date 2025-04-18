package core.java.programs;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

// Main class should be named 'Solution' and should not be public.
class Pyramid {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.println("$ ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
