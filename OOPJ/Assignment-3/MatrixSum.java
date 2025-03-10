/*
20.  Sum of Two Matrices 
○  Given two matrices of the same size, compute their sum
*/
import java.util.Scanner;

public class MatrixSum {
    public static int[][] addMatrices(int[][] A, int[][] B, int m, int n) {
        int[][] sum = new int[m][n];

        // Compute the sum of A and B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
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

        // Accept matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];

        // Accept matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Accept matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Compute sum of matrices
        int[][] sumMatrix = addMatrices(A, B, m, n);

        // Print matrices and their sum
        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nSum of Matrices:");
        printMatrix(sumMatrix);

        sc.close();
    }
}
