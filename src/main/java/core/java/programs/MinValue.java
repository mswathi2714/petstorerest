package core.java.programs;

public class MinValue {
    public Integer findMinElement(int[] array) {
        int minElement = array[0];
        for(int number: array){
            if(number < minElement){
                minElement = number;
            }
        }
        return minElement;
    }
    public static void main(String[] args) {
        MinValue sol = new MinValue();
        int[] input = {4,5,6,10,8,9,2};
        Integer minValue = sol.findMinElement(input);
        System.out.print(" Minimum value:  " + minValue);
    }
}