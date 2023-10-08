package Sorting;
import java.util.ArrayList;
import java.util.Collections;

public class Inbuild_Sort_Using_Collection {
    public static void inbuildSort(int[] arr) {
        // Convert the int array to an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arr) {
            list.add(value);
        }

        // Sort the list in reverse order
        Collections.sort(list, Collections.reverseOrder());

        // Copy the sorted list back to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static void printArr(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {34, 30, 45, 21, 12, 2, 77, 89, 0};
        System.out.println("Original Array: ");
        printArr(arr);

        inbuildSort(arr);
        System.out.println("Sorted Array in Reverse Order: ");
        printArr(arr);
    }
}
