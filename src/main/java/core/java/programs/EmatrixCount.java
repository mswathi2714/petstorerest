package core.java.programs;

class EmatrixCount {
    public static int countSubmatricesWithE(char[][] board) {
        // TODO: Initialize a count variable to keep track of 3x3 submatrices with 'E's in all four corners
        int row = board.length;
        int col = board[0].length;
        int countVal =0;
        // TODO: Use a nested loop to go through each element that can be the top-left corner of a 3x3 submatrix
        for (int i =0; i<board.length-2;i++) {
            for (int j=0; j<board[0].length-2;j++) {
                if(board[i][j]== 'E' && board[i][j+2]== 'E' && board[i+2][j]== 'E' && board[i+2][j+2] == 'E'){
                    countVal += 1;
                }
            }
        }
        // If it does, increment the count

        // TODO: Return the count of submatrices with 'E's in all four corners
        return countVal;
    }
    public static void main(String[] args) {
        // TODO: Define a 2D array 'board' with some 'E's and 'P's, representing empty and piece positions respectively
        char[][] inputMatrix = {
                {'E', 'P', 'E', 'P'},
                {'P', 'E', 'P', 'E'},
                {'E', 'P', 'E', 'P'},
                {'P', 'E', 'P', 'E'}
        };

        // TODO: Call the function to count the submatrices and output the result
        int count = countSubmatricesWithE(inputMatrix);
        System.out.print("Count : "+ count);

    }
}