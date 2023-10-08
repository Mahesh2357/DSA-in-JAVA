package Arrays_2D;

public class DiagonalSum {
    public static int diagonalSum(int[][] arr) {
        // Check if the array is square (has the same number of rows and columns)
        int rows = arr.length;
        int columns = arr[0].length;
        
        if (rows != columns) {
            return -1;  // Return -1 if it's not a square array
        }

        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            diagonalSum += arr[i][i];  // Add the diagonal element at (i, i)
        }

        return diagonalSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = diagonalSum(matrix);
        if (result != -1) {
            System.out.println("The diagonal sum is: " + result);
        } else {
            System.out.println("The input matrix is not square.");
        }
    }
}
