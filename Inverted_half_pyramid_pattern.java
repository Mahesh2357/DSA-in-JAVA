package AP_Pattern_II;

public class Inverted_half_pyramid_pattern {
	public static void invertedHalfPyramid(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invertedHalfPyramid(6);
	}

}
