package Sorting;

import java.util.Arrays;

public class Counting_Sort_GPT {
    public static void countingSort(int[] arr) {
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

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {45, 69, 12, 34, 68, 23, 90};
        System.out.println("Original Array:");
        printArr(arr);

        countingSort(arr);
        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
