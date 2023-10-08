package BIt_Manipulation;

public class clear_ith_bit {
	public static int clearBit(int n, int i) {
		int bitMask = ~(1 << i);
		
		return n & bitMask;
	}
	
//	10 --> 1010   i =1
//	1  --> 0100
//	-----------
	
//	for 10 = 1010--->
//	~(1 << i) => ~(0010)
//			   = 1101
	
//        	10 --> 1010   i =1
//	~(1 << i)  --> 1101
//      	-----------
//			       1000 --> (8)10
			       
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearBit(10, 1));
	}

}
