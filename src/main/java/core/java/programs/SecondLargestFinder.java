package core.java.programs;

public class SecondLargestFinder {
    public Integer findSecondLargest(int[] nums) {
        //Validate inputs
        if (nums == null || nums.length < 2) {
            return null;
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : nums) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargestFinder finder = new SecondLargestFinder();
        int[] numbers = {11, 34, 5, 7, 9, 1};
        Integer secondLargest = finder.findSecondLargest(numbers);
        System.out.println("Second largest number: " + secondLargest);
    }
}
