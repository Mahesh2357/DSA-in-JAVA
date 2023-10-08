package AP_Pattern_II;

import java.util.Scanner;

public class Rotated_Half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close(); // Close the scanner when done.

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces for alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print asterisks for the pyramid
            }
            System.out.println(); // Move to the next line after each row.
        }
    }
}

