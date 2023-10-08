package AP_Arrays;

public class LargestAndSmallest_In_One_Function {
    
    public static void findLargestAndSmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
    public static void main(String[] args) {
		int numbers[] = {32, 43, 45, 346, 78, -2, 0, 98, 21};
		
		findLargestAndSmallest(numbers);
		
	}
}
