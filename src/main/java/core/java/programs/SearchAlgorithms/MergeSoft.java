package core.java.programs.SearchAlgorithms;

import java.util.Arrays;

public class MergeSoft {

    static void mergeSort(int[] musicLibrary, int start, int end) {
        if (start<end) {
            int mid = (start + end) / 2;
            mergeSort(musicLibrary, start, mid);
            mergeSort(musicLibrary, mid + 1, end);
            merge(musicLibrary, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        //Define split array sizes then initialize arrays
        int n1 = mid - start + 1;
        int n2 = end - mid;
        // Initializing arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Fill both arrays from main array
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        //Then swapping merging arrays until both i and j are equal, leftovers will be added back to main array below
        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //Fill leftovers from n1 and n2
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int[] musicLibrary = {9, 3, 1, 6, 8, 2, 5, 4, 7};
        System.out.println("Before sorted list: " + Arrays.toString(musicLibrary));
        mergeSort(musicLibrary, 0, musicLibrary.length-1);
        System.out.println("Sorted list: " + Arrays.toString(musicLibrary));
    }
}
