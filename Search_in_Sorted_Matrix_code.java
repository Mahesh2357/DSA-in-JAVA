package Arrays_2D;

public class Search_in_Sorted_Matrix_code {
   
    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int target = 11;
        boolean found = searchInSortedMatrix(matrix, target);

        if (found) {
            System.out.println("Element " + target + " is found in the matrix.");
        } else {
            System.out.println("Element " + target + " is not found in the matrix.");
        }
    }

}
