package core.java.programs;

public class CountArray {
    public int[] solution(int[] nums) {
        int even_count = 0;
        int odd_count = 0;
        int[] countArray = {even_count, odd_count};
        for(int number: nums){
            if(number % 2 == 0){
                even_count += 1;
            } else if (number % 2 > 0){
                odd_count += 1;
            }
        }
        countArray[0] = even_count;
        countArray[1] = odd_count;
        return countArray;
    }
    public static void main(String[] args) {
        CountArray sol = new CountArray();
        int[] input = {4,5,6,10,8,9,2};
        int[] countArray = sol.solution(input);
        System.out.println(countArray[0] + " " + countArray[1]);
    }
}
