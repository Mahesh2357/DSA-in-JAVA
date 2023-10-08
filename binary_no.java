package BIt_Manipulation;

public class binary_no {
    public static void main(String[] args) {
        // Define binary literals
        int binaryNumber1 = 0b1010; // Binary literal for 10
        int binaryNumber2 = 0b1101; // Binary literal for 13

        // Perform operations
        int result1 = binaryNumber1 + binaryNumber2;
        int result2 = binaryNumber1 * binaryNumber2;

        // Convert the results to binary strings for output
        String binaryResult1 = Integer.toBinaryString(result1);
        String binaryResult2 = Integer.toBinaryString(result2);

        // Display the results
        System.out.println("Binary Number 1: " + Integer.toBinaryString(binaryNumber1)); // Should print "1010"
        System.out.println("Binary Number 2: " + Integer.toBinaryString(binaryNumber2)); // Should print "1101"
        System.out.println("Sum in Binary: " + binaryResult1); // Should print "10111" (10 + 13 = 23)
        System.out.println("Product in Binary: " + binaryResult2); // Should print "11110" (10 * 13 = 130)
    }
}
