package core.java.programs.SearchAlgorithms;

public class LowestIndexBinary {
    public static int findMin(int[] publishedIndexes) {
        int left = 0;
        int right = publishedIndexes.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (publishedIndexes[mid] > publishedIndexes[mid + 1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return publishedIndexes[left];
    }
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 1, 2, 3};
        System.out.println("Find the min: " + findMin(array));
       // System.out.println("Search Bitonic Array : " + searchBitonicArray(array, 2));
    }
}
