package Sorting;

import java.util.Arrays;

public class All_Sorting_Algo {

	public static void bubbleSort(int[] arr) {
		for (int turn = 0; turn < arr.length; turn++) {

			for (int j = 0; j < arr.length - 1 - turn; j++) {

				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int arr[]) {
		for (int turn = 0; turn < arr.length; turn++) {
			int midPos = turn;

			for (int j = turn + 1; j < arr.length; j++) {
				if (arr[midPos] < arr[j]) {
					midPos = j;
				}
			}
			int temp = arr[turn];
			arr[turn] = arr[midPos];
			arr[midPos] = temp;
		}
	}

	public static void insertionSortDescending(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int prev = i - 1;
			// to find the index where curr is to beinserted
			while (prev >= 0 && arr[prev] < curr) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = curr;
		}
	}

	public static void countingSortDescending(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			largest = Math.max(largest, arr[i]);
		}
		int count[] = new int[largest + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int j = 0;
		for (int i = count.length - 1; i >= 0; i--) {
			while (count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	 public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3, 6, 2, 11, 11, 111, 34, 8, 7, 4, 5, 3, 1};
        System.out.println("Original Array:");
        printArray(arr);

        // Bubble Sort
        int bubbleSortArr[] = Arrays.copyOf(arr, arr.length);
        countingSortDescending(bubbleSortArr);
        System.out.println("Sorted Array using Bubble Sort (Descending Order):");
        printArray(bubbleSortArr);

        // Selection Sort
        int selectionSortArr[] = Arrays.copyOf(arr, arr.length);
        insertionSortDescending(selectionSortArr);
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
