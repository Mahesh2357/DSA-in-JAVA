package BIt_Manipulation;

public class get_ith_bit {

	public static int getIthbit(int n, int i) {
		int bitMask = 1 << i;

		if ((n & bitMask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
//	public static int getIthBit(int n, int i) {
//        return (n & (1 << i)) >> i;
//    }

	
//	logic

//	i != 0 --> ith bit 1
//	i = 0 --> ith bit 0 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getIthbit(10, 2));
		System.out.println(getIthbit(3, 1));
	}

}
