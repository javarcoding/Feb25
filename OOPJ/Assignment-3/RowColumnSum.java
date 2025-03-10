/*
21.  Row-wise and Column-wise Sum 
○  Find the sum of each row and each column of a given matrix.
*/

import java.util.Scanner;

public class RowColumnSum {
    public static void rowColumnSum(int[][] matrix, int m, int n) {
        // Calculate and print row-wise sum
        System.out.println("\nRow-wise Sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
        }

        // Calculate and print column-wise sum
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum: " + colSum);
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

        // Accept matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Accept matrix elements
        System.out.println("Enter " + (m * n) + " elements row-wise:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        // Compute row-wise and column-wise sum
        rowColumnSum(matrix, m, n);

        sc.close();
    }
}
