package core.java.programs.SearchAlgorithms;

public class BitonicSearch {
    public static int findPeak(int[] temperatures) {
        int left = 0;
        int right = temperatures.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (temperatures[mid] > temperatures[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int binarySearch(int[] num, int left, int right, int target, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target) return mid;
            if (ascending? num[mid] < target : num[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchBitonicArray(int[] array, int target) {
        int resultIndex = 0;
        int peak = findPeak(array);
        resultIndex = binarySearch(array, 0, peak, target, true);
        if (resultIndex != -1) {
            return resultIndex;
        } else {
            return binarySearch(array, peak + 1, array.length - 1, target, false);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 3, 2};
        System.out.println("Find the Peak: " + findPeak(array));
        System.out.println("Search Bitonic Array : " + searchBitonicArray(array, 2));
    }

}
