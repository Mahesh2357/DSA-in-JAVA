package AP_Pattern_II;

public class Butterfly_Pattern {
	public static void butterflyPattern(int n) {
		int i, j, k;
		// 1st half
		for (i = 1; i <= n; i++) {
			// stars -i
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// spaces -2*(n-i)
			for (j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// stars -i
			for (j = 1; j <= i; j++) {
				System.out.print("&");
			}
			System.out.println();
		}

		// 2nd half
		for (i = n; i >= 1; i--) {
			// stars -i
			for (j = 1; j <= i; j++) {
				System.out.print("#");
			}
			// spaces -2*(n-i)
			for (j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// stars -i
			for (j = 1; j <= i; j++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		butterflyPattern(7);
	}

}
