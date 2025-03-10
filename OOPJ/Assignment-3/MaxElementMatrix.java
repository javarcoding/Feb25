/*
22.  Find the Maximum Element in a Matrix 
○  Find the largest element in a given matrix.

*/

import java.util.Scanner;

public class MaxElementMatrix {
    public static int findMaxElement(int[][] matrix, int m, int n) {
        int maxElement = Integer.MIN_VALUE; // Initialize with the smallest possible value

        // Traverse the matrix to find the maximum element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
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

        // Find the maximum element
        int maxElement = findMaxElement(matrix, m, n);
        System.out.println("\nMaximum Element in the Matrix: " + maxElement);

        sc.close();
    }
}
