package BIt_Manipulation;
public class BitManipulation {

    // Get the value of the i-th bit (0-based indexing)
    public static int getBit(int n, int i) {
        return (n >> i) & 1;
    }

    // Set the i-th bit to 1
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Clear the i-th bit (set it to 0)
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Update the i-th bit to the given value (0 or 1)
    public static int updateBit(int n, int i, int value) {
//        if (value == 0) {
//            return clearBit(n, i);
//        } else {
//            return setBit(n, i);
//        }
        
        n = clearBit(n, i);
        int bitMask = value << i;
        return n | bitMask;
    } 
    
    public static int clearIBit(int n, int i) {
    	int bitMask = ~(0)<< i;
    	return n & bitMask;
    }
    
 // Clears a range of bits from start to end (inclusive)
    public static int clearBitsInRange(int num, int start, int end) {
//        int mask = ((1 << (end - start + 1)) - 1) << start;
//        return num & ~mask;
    	
    	int a = ((~0) << (end+1));
    	int b = (1<<start)-1;
    	int bitMask = a|b;
    	return num & bitMask;
    }

    public static void main(String[] args) {
        int number = 10; // Binary: 1010

        System.out.println("Original Number: " + number);
        System.out.println("Get Bit 2: " + getBit(number, 2)); // Get bit 2: 1
        System.out.println("Set Bit 1: " + setBit(number, 1)); // Set bit 1: 14 (Binary: 1110)
        System.out.println("Clear Bit 3: " + clearBit(number, 3)); // Clear bit 3: 2 (Binary: 0010)
        System.out.println("Update Bit 0 to 1: " + updateBit(number, 0, 1)); // Update bit 0 to 1: 11 (Binary: 1011)
        System.out.println("Clear i bit : " + clearIBit(15, 2));
        
        int number1 = 110; // Binary: 1101110

        System.out.println("Original Number: " + number1);
        int clearedNumber = clearBitsInRange(number1, 2, 5);
        System.out.println("Cleared Bits 2 to 5: " + clearedNumber);
    }
}


