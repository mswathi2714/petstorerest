package core.java.programs;

import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for (int j=0;j <nums.length-1-i;j++){
                if(nums[j]> nums[j+1]) {
                    //Swap numbers
                    int x= nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = x;
                }
            }

        }

        return nums;
    }
    public static void main (String[] args) {
        SortArray sol = new SortArray();
        int[] numbers = {11,34,5,7,9,1};
        int[] sortedNumbers = sol.sortArray(numbers);
        System.out.println("Output Value" + Arrays.toString(sortedNumbers));
        int secondMax = sortedNumbers[4];
        System.out.println("Output Value" + secondMax);
    }
}