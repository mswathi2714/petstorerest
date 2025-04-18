package core.java.programs;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixFilling {
public static void main (String args[]) {
    //int[][] input = [[1,2,3], [4,5,6], [7,8,9]];
    int[][] numbers = new int[][] {{1, 2, 3,4}, {4, 5, 6,7}, {7, 8, 9,10}};
    int[][] result = generateMatrix(5);
    System.out.println(Arrays.deepToString(result));
}
public static int[][] generateMatrix(int n) {
    int[][] ans = new int[n][n];
    final int[] dirs = {0, 1, 0, -1, 0};
    int i = 0, j = 0, k = 0;
    for (int v = 1; v <= n * n; ++v) {
        ans[i][j] = v;
        int x = i + dirs[k], y = j + dirs[k + 1];
        if (x < 0 || x >= n || y < 0 || y >= n || ans[x][y] != 0) {
            k = (k + 1) % 4;
        }
        i += dirs[k];
        j += dirs[k + 1];
    }
    return ans;
}

}
