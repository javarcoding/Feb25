/*
7. Write a program that uses boolean literals to control program flow in an if-else 
statement.
*/

import java.util.Scanner;

public class BooleanLiteralExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Boolean literals controlling program flow
        boolean isPositive = num > 0; // true if number is positive, false otherwise

        if (isPositive) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        scanner.close();
    }
}
