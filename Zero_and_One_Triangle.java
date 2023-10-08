package AP_Pattern_II;

public class Zero_and_One_Triangle {
	//i + j = even --> 1
	//i + j = odd --> 0

	public static void zeroTriangle(int n) {
		for(int i=1; i<= n; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2 ==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zeroTriangle(7);
	}

}
 