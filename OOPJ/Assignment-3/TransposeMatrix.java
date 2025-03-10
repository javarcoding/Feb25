/*19.  Transpose of a Matrix 
○  Given a matrix, return its transpose (swap rows and columns).
*/
import java.util.Scanner;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix, int m, int n) {
        int[][] transposed = new int[n][m]; // Transposed matrix has dimensions (n × m)

        // Swap rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
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

        // Compute transpose
        int[][] transposedMatrix = transpose(matrix, m, n);

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Print transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);

        sc.close();
    }
}
