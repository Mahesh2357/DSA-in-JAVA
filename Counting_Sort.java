package Sorting;

public class Counting_Sort {
	// Count Array counts the frequency of numbers.
	public static void countingSort(int arr[]) {
		
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			largest = Math.max(largest, arr[i]);
		}
		
		int count[] = new int[largest + 1];
		for (int i = 0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		int j = 0;
		for(int i = 0; i<count.length; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void printArr(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 45, 69, 12, 34, 68, 23, 90 };
		System.out.println("Original Array : ");
		printArr(arr);
		
		countingSort(arr);
		System.out.println();
		System.out.println(" Sorted Array : ");
		printArr(arr);

	}

}
