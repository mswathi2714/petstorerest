package core.java.programs;

import java.util.ArrayList;
import java.util.List;

class FindHikePath {

    public static List<int[]> findHikePath(int[][] grid, int startRow, int startCol) {
        List<int[]> path = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        int currentRow = startRow;
        int currentCol = startCol;
        path.add(new int[]{currentRow, currentCol});

        boolean moved;
        do {
            moved = false;
            int maxAltitude = grid[currentRow][currentCol];
            int nextRow = currentRow;
            int nextCol = currentCol;

            for (int[] dir : directions) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] > maxAltitude) {
                    maxAltitude = grid[newRow][newCol];
                    nextRow = newRow;
                    nextCol = newCol;
                    moved = true;
                }
            }

            if (moved) {
                currentRow = nextRow;
                currentCol = nextCol;
                path.add(new int[]{currentRow, currentCol});
            }
        } while (moved);

        return path;
    }

    public static void main(String[] args) {
        int[][] mountain = {
                {1, 2, 3},
                {2, 5, 7},
                {4, 6, 9}
        };

        List<int[]> path = findHikePath(mountain, 0, 1);
        for (int[] pos : path) {
            System.out.println("(" + pos[0] + ", " + pos[1] + ")");
        }
    }
}