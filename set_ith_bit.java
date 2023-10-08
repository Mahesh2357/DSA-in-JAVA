package BIt_Manipulation;

public class set_ith_bit {
	public static int setIthBit(int n, int i) {
		int bitMask = 1 << i;
		
		return n | bitMask;
	}
	
//	10 --> 1010   OR
//	2  --> 0100
//	-----------
//	       1110 --> 2^3 + 2^2 + 2^1 = 14

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setIthBit(10, 2));
	}

}
