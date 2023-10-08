package AP_Arrays;

public class BinarySearchArray {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid; // Return the index where the key is found
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Return -1 if the key is not found in the array
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 7, 8, 9};
        int key = 1;

        int index = binarySearch(numbers, key);

        if (index != -1) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array");
        }
    }
}
