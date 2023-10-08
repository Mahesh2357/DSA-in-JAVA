package AP_Arrays;

public class Kadanes_Method_chatgpt {
    public static int maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, 1, -2, 1, 5, -3};
        int maxSum = maxSubArraySum(numbers);

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
