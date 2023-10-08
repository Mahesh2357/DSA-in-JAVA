package AP_Arrays;

import java.util.Scanner;

public class Array_IO {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int marks[] = new int[100];
		
		System.out.println("Enter the Marks : ");
		Scanner sc = new Scanner(System.in);
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		
		System.out.println("Physics : " + marks[0]);
		System.out.println("Maths : " + marks[1]);
		System.out.println("Chem : " + marks[2]);
		
		marks[2] = 90;
		System.out.println("Updated Chem Marks : " + marks[2]);
	
		marks[2] = marks[2] + 1;
		System.out.println("Updated Chem Marks : " + marks[2]);
	
		int percentage = (marks[0] + marks[1] + marks[2])/3;
		System.out.println(percentage);
	
	}
}
