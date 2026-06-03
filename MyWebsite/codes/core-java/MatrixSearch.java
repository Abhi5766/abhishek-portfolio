import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = input.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Value to search
        System.out.print("Enter value to search: ");
        int target = input.nextInt();

        boolean found = false;

        // Search for the target in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        // Output result
        if (found) {
            System.out.println(target + " is found in the matrix.");
        } else {
            System.out.println(target + " is not found in the matrix.");
        }

        input.close();
    }
}
