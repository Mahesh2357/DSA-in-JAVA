package AP_Arrays;

public class Reverse_an_Array {
	public static void ReversedArray(int numbers[]) {
		int first = 0, last = numbers.length-1;
		
		while(first < last) {
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;
			
			first++;
			last--;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 3, 4, 45, 67};
		
		ReversedArray(numbers);
		System.out.println("Reversed Array : ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
