package core.java.programs;

public class SmallestCount {
    public int countMin(int[] numbers) {
        if(numbers.length >0){
            int smallest = numbers[0] ;
            int count =1;
            for(int i=1;i<numbers.length;i++){
                if(numbers[i] < smallest) {
                    smallest = numbers[i];
                    count =1;
                } else if (numbers[i] == smallest) {
                    count +=1;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        SmallestCount sol = new SmallestCount();
        int[] input = {4,5,2,10,2,9,2,1,1,0 ,0 ,0,0};
        int minValue = sol.countMin(input);
        System.out.println("Smallest count"+ minValue);
    }
}