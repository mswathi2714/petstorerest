package core.java.programs;

import java.util.*;


public class SecondLargest {

    public int findSecondLargest(List<Integer> numbers) {
        if(numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements");
        }
        Set<Integer> set1 = new HashSet<>(numbers);
        //Using set to find secondLargest Number
        set1.remove(Collections.max(set1));
        return Collections.max(set1);


        //Using priority queue
        /*PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(set1);
        //removing max number
        pq.poll();
        return pq.poll();*/
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        SecondLargest secondLargest = new SecondLargest();
        List<Integer> numbers = List.of(3, 2, 2, 3, 7, 3, 5,7);
        int result = secondLargest.findSecondLargest(numbers);
        System.out.println("Second largest number is: " + result);
    }
}
