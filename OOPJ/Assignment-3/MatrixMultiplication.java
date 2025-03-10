/*
23.  Matrix Multiplication 
○  Multiply two matrices and return the resultant matrix.
*/

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B, int m, int n, int p) {
        int[][] result = new int[m][p];

        // Multiply matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
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

        // Input dimensions for Matrix A
        System.out.print("Enter number of rows of Matrix A (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns of Matrix A / rows of Matrix B (n): ");
        int n = sc.nextInt();

        // Input dimensions for Matrix B
        System.out.print("Enter number of columns of Matrix B (p): ");
        int p = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];

        // Accept elements of Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Accept elements of Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        int[][] resultMatrix = multiplyMatrices(A, B, m, n, p);

        // Print matrices and result
        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nResultant Matrix (A × B):");
        printMatrix(resultMatrix);

        sc.close();
    }
}
