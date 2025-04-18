package core.java.programs.SearchAlgorithms;

import java.util.*;
class Patition2 {
    static int partitionCelestial(int[] magnitudes, int start, int end) {
        int pivot = magnitudes[end];
        int i = start-1;
        // TODO: Implement the partition loop
        for (int j=start; j< end; j++){
            if(magnitudes[j] <= pivot){
                i++;
                int temp2 = magnitudes[j];
                magnitudes[j] = magnitudes[i];
                magnitudes[i] = temp2;
            }
        }
        int temp = magnitudes[i + 1];
        magnitudes[i + 1] = magnitudes[end];
        magnitudes[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] celestialMagnitudes = {5, 3, 0, -1, -2, 1};
        int pivotPosition = partitionCelestial(celestialMagnitudes, 0, celestialMagnitudes.length - 1);
        System.out.println("Pivot position: " + pivotPosition);
        System.out.println("Partitioned array: " + Arrays.toString(celestialMagnitudes));
        // Now, celestialMagnitudes is partitioned, with pivot in the correct position.
    }
}