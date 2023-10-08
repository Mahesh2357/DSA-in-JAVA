package Sorting;

import java.util.Arrays;

public class Inbuilt_Sort {
	public static void inbuiltSort(int arr[]) {
		Arrays.sort(arr);
	}

	public static void printArr(int arr[]) {
		for(int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23, 67, 11, 3, 24, 7, 4};
		System.out.println("Original Array : ");
		printArr(arr);
		
		inbuiltSort(arr);
		
		System.out.println("Sorted Array using Build-in Sort : ");
		printArr(arr);
	}

}
