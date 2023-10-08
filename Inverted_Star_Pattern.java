package AP_Pattern_I;

import java.util.Scanner;

public class Inverted_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No : ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j<= n-i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
