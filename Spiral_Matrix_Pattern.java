package Arrays_2D;

public class Spiral_Matrix_Pattern {

	public static void printSpiral(int matrix[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length - 1;
		int endCol = matrix[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {

			// Print the top row
			for (int j = startCol; j <= endCol; j++) {
				System.out.print(matrix[startRow][j] + " ");
			}

			// Print the right column
			for (int i = startRow+1; i <= endRow; i++) {
				System.out.print(matrix[i][endCol] + " ");
			}

			// Print the bottom row (if there are more rows)

			for (int j = endCol - 1; j >= startCol; j--) {
				System.out.print(matrix[endRow][j] + " ");
			}

			// Print the left column (if there are more columns)
			for (int i = endRow - 1; i >= startRow + 1; i--) {
				System.out.print(matrix[i][startCol] + " ");
			}
			startCol++;
			startRow++;
			endRow--;
			endCol--;

		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printSpiral(matrix);
	}
}
