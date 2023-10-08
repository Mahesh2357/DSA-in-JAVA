package AP_Pattern_II;

import java.util.Scanner;

public class Floyds_Triangle_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close(); // Close the scanner when done.

        int number = 1; // Initialize the starting number to 1
                
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Move to the next line after each row.
        }
    }
}
