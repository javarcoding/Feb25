/*
18.  Print a Matrix 
○  Given an m x n matrix, print all its elements row-wise.
*/

import java.util.Scanner;

public class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Matrix elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
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

        // Print the matrix row-wise
        printMatrix(matrix);
        sc.close();
    }
}
