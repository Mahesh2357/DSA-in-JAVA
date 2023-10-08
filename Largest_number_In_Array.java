package AP_Arrays;

public class Largest_number_In_Array {
	
	public static int getlargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		return largest;
		
	}

	public static void main(String[] args) {
		int numbers[] = {1, 3, 4, 5, 8 ,9 };
		
		System.out.println("largest num : " + getlargest(numbers));
		// TODO Auto-generated method stub
	}
}


