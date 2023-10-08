package BIt_Manipulation;

public class Bitwise_Operator {
	public static void main(String[] args) {

//		int a = 5;
//		int b = 6;
//		System.out.println(a & b);

		int a = 5; // binary: 0101
		int b = 3; // binary: 0011

		// Bitwise AND
		int andResult = a & b; // binary: 0001 (decimal: 1)
		System.out.println("Bitwise AND Result: " + andResult);

		// Bitwise OR
		int orResult = a | b; // binary: 0111 (decimal: 7)
		System.out.println("Bitwise OR Result: " + orResult);

		// Bitwise XOR
		int xorResult = a ^ b; // binary: 0110 (decimal: 6)
		System.out.println("Bitwise XOR Result: " + xorResult);

		// Bitwise NOT
		int notResult = ~a; // binary: 11111111111111111111111111111010 (negative due to two's complement)
		System.out.println("Bitwise NOT Result: " + notResult);

		// Left Shift
		int leftShiftResult = a << 2; // binary: 010100 (decimal: 20)
		System.out.println("Left Shift Result: " + leftShiftResult);

		// Right Shift
		int rightShiftResult = a >> 2; // binary: 0001 (decimal: 1)
		System.out.println("Right Shift Result: " + rightShiftResult);

		// Unsigned Right Shift
		int unsignedRightShiftResult = a >>> 2; // binary: 0001 (decimal: 1)
		System.out.println("Unsigned Right Shift Result: " + unsignedRightShiftResult);
	}
}


