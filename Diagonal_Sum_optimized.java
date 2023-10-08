package Arrays_2D;

public class Diagonal_Sum_optimized {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Sum of the main diagonal

            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1]; // Sum of the secondary diagonal
            }
        }

        return sum; // Return the diagonal sum
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result = diagonalSum(matrix);
        System.out.println("The diagonal sum is: " + result);
    }
}
