package AP_Pattern_II;

public class Floyds_triangle {
	public static void floydTriangle(int n) {
		//outer
		int counter = 1;
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=n-i+1; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floydTriangle(9);
	}

}
