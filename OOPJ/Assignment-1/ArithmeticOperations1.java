/*
8. Write a program to perform addition, subtraction, multiplication, division, and 
modulus operations on two integer numbers and display the results.
*/
import java.util.Scanner;

public class ArithmeticOperations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? (num1 / num2) : 0; // Handling division by zero
        int remainder = (num2 != 0) ? (num1 % num2) : 0; // Handling division by zero

        // results
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        } else {
            System.out.println("Division and Modulus operations cannot be performed (division by zero).");
        }

        scanner.close();
    }
}
