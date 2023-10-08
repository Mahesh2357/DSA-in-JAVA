package Arrays_2D;



public class Spiral_Matrix {
	
	public static void printSpiral(int matrix[][]) {
	
	}
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        spiralOrderTraversal(matrix, rows, columns);
    }

    static void spiralOrderTraversal(int[][] matrix, int rows, int columns) {
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse from left to right (top row)
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Traverse from top to bottom (right column)
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Check if there are more rows and columns to traverse
            if (topRow <= bottomRow) {
                // Traverse from right to left (bottom row)
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Check if there are more rows and columns to traverse
            if (leftCol <= rightCol) {
                // Traverse from bottom to top (left column)
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }
}
