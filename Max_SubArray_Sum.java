package AP_Arrays;

public class Max_SubArray_Sum {
	public static void maxSubArraySum(int numbers[]) {
		int TS = 0;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			int start = i;
			
			for(int j = 0; j < numbers.length; j++) {
				int end = j;
				currSum = 0;
				for(int k = start; k <= end; k++) {
					currSum += numbers[k];
				}
				System.out.println(currSum);
				
				if(currSum > maxSum) {
					maxSum = currSum;
				}
			}
			System.out.println();
			TS++;
		}
		System.out.println("toatal sUBaRRAY : " + TS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, -2, 3, 6, 4};
		maxSubArraySum(numbers);
	}

}
