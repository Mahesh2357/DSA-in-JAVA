package AP_Pattern_II;

import java.util.Scanner;

public class Hollow_Rectangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = sc.nextInt();
		System.out.println("");
		sc.close();
		
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns) {
					System.out.print("&");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
