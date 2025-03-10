/*
24.  Rotate a Matrix by 90 Degrees 
○  Rotate a given N x N matrix by 90 degrees clockwise. 
*/
import java.util.Scanner;

public class RotateMatrix90 {
    public static void rotate90Clockwise(int[][] matrix, int n) {
        // Step 1: Transpose the matrix (swap rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to achieve 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size (N x N)
        System.out.print("Enter the size of the square matrix (N): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Accept matrix elements
        System.out.println("Enter " + (n * n) + " elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Rotate the matrix by 90 degrees
        rotate90Clockwise(matrix, n);

        // Print rotated matrix
        System.out.println("\nMatrix after 90-degree rotation:");
        printMatrix(matrix);

        sc.close();
    }
}
