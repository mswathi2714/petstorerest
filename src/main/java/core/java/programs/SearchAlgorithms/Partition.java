package core.java.programs.SearchAlgorithms;

class Partition {
    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;

        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void main(String[] args) {
        int[] items = {7, 3, 2, 10, 9, 5, 6, 9, 2, 3};
        int pivotIndex = partition(items, 0, items.length - 1);

        System.out.println("Pivot Index: " + pivotIndex);
        for (int item : items) {
            System.out.print(item + " ");
        }
    }
}