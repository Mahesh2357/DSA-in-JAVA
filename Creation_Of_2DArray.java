package Arrays_2D;

import java.util.Scanner;

public class Creation_Of_2DArray {

    public static void main(String[] args) {
        int n = 3, m = 3; // Define the dimensions of the 2D array
        int matrix[][] = new int[n][m]; // Create a 3x3 2D array

        Scanner sc = new Scanner(System.in);

        // Input values for the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the contents of the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
