/*
Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators
*/

import java.util.Scanner;

public class MinOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Using nested ternary operator to find the minimum
        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d))
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));

        System.out.println("The minimum number is: " + min);

        scanner.close();
    }
}
