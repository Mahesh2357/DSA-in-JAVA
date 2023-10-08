package BIt_Manipulation;

public class Check_Odd_Even {
	
	public static void oddEven(int n) {
		
		int bitMask = 1;
		
		if((n & bitMask) == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddEven(4);
		oddEven(6);
		oddEven(7);
	}

}
