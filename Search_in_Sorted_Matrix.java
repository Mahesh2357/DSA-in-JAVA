package Arrays_2D;

public class Search_in_Sorted_Matrix {
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 37, 45, 66},
            {32, 33, 39, 61}
        };

        int key = 45;
        stairCaseSearch(matrix, key);
        
        int w = 20;
        stairCaseSearch(matrix, w);
    }
}
