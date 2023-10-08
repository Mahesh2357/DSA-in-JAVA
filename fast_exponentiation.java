package BIt_Manipulation;

public class fast_exponentiation {
	public static int fastExpo(int a, int n) {
		int ans = 1;

		while (n > 0) {

			if ((n & 1) != 0) {
				ans = ans * a;
			}
			a = a * a;
			n = n >> 1;
		}
		return ans;
	}

//	a ^ b ---> (log2(10^a) + 1)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastExpo(5, 3));
	}

}
