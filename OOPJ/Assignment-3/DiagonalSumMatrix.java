/*
25.  Find the Diagonal Sum 
○  Compute the sum of both diagonals in a square matrix.
*/
import java.util.Scanner;

public class DiagonalSumMatrix {
    public static int findDiagonalSum(int[][] matrix, int n) {
        int primarySum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];                // Primary diagonal
            secondarySum += matrix[i][n - i - 1];      // Secondary diagonal
        }

        // If N is odd, subtract the middle element as it gets added twice
        if (n % 2 != 0) {
            secondarySum -= matrix[n / 2][n / 2];
        }

        return primarySum + secondarySum;
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
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        // Compute diagonal sum
        int diagonalSum = findDiagonalSum(matrix, n);
        System.out.println("\nSum of both diagonals: " + diagonalSum);

        sc.close();
    }
}
