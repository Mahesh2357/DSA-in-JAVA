package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            
            for(int j = i+1; j < arr.length; j++) {
            	//For increasing Order
            	if(arr[minIndex] > arr[j]) {
            		minIndex = j;            		
            	}
            	
            	//For Decreasing Order
            	
//            	if(arr[minIndex] < arr[j]) {
//            		minIndex = j;
//            	}
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        printArray(arr);
        
    }
}
