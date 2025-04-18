package core.java.programs.StringOperation;

public class FindTriplets{

    static int findTripletsCount(String s)  {
        System.out.println("String length "+ s.length());
        int triplet =0;
        char[] input = s.toCharArray();
        for (int i =0; i<input.length-2 ; i++) {
            if(input[i] == input[i+1] && input[i+1] == input[i+2]) {
                System.out.println("i , i+1: "+ input[i]+" "+input[i+1]);
                triplet += 1;
            }
        }
        return triplet;
    }

    public static void main(String[] args) {
        int output = findTripletsCount("JIBBBOOOMMMM");
        System.out.println("Output :" +output);
    }
}

