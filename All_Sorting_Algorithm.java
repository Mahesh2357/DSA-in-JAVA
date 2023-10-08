package Sorting;

import java.util.Arrays;

public class All_Sorting_Algorithm {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void countingSortDescending(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int value : arr) {
            count[value - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        System.out.println("Original Array:");
        printArray(arr);

        // Bubble Sort
        int bubbleSortArr[] = Arrays.copyOf(arr, arr.length);
        bubbleSortDescending(bubbleSortArr);
        System.out.println("Sorted Array using Bubble Sort (Descending Order):");
        printArray(bubbleSortArr);

        // Selection Sort
        int selectionSortArr[] = Arrays.copyOf(arr, arr.length);
        selectionSortDescending(selectionSortArr);
        System.out.println("Sorted Array using Selection Sort (Descending Order):");
        printArray(selectionSortArr);

        // Insertion Sort
        int insertionSortArr[] = Arrays.copyOf(arr, arr.length);
        insertionSortDescending(insertionSortArr);
        System.out.println("Sorted Array using Insertion Sort (Descending Order):");
        printArray(insertionSortArr);

        // Counting Sort
        int countingSortArr[] = Arrays.copyOf(arr, arr.length);
        countingSortDescending(countingSortArr);
        System.out.println("Sorted Array using Counting Sort (Descending Order):");
        printArray(countingSortArr);
    }
}
