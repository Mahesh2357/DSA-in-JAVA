package AP_Arrays;

public class Binary_Search_In_Array {
	public static void binarySearch(int numbers[], int key) {
		int start = 0, end = numbers.length-1;
		
		while(start <= end) {
			int mid = (start + end)/ 2;
			
			if(numbers[mid] == key) {
				System.out.println(mid);
			}
			if(numbers[mid] < key) {
				start = mid +1;
			}
			else {
				end = mid - 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2, 4, 5, 6, 7, 8, 9};
		int key = 8;
//		System.out.println("index for key is : " + binarySearch(numbers, key));
		binarySearch(numbers, key);
	}

}
