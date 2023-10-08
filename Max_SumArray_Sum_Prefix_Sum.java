package AP_Arrays;

public class Max_SumArray_Sum_Prefix_Sum {
    public static int maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            
            if (currSum < 0) {
                currSum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 3, 6, 4};
        int maxSum = maxSubArraySum(numbers);
        
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
