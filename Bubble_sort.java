package Sorting;

public class Bubble_sort {
	public static void bubbleSort(int [] arr1) {
		for(int i = 0; i  < arr1.length-1; i++) {
			
			for(int j = 0; j < arr1.length - 1- i; j++) {
				if(arr1[j] > arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
	}

	public static void printArr(int arr1[]) {
		System.out.print("Sorted Array : ");
		for(int i =0; i<arr1.length; i++) {
			System.out.print( arr1[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {41, 5, 11, 62, 43};
		bubbleSort(arr1);
		printArr(arr1);
	}

}
