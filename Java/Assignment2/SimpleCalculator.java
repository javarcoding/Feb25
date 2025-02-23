/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if else to check if division by zero is attempted and display an error message.

*/

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two numbers and an operator.
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;
        
        // Use a switch statement to perform the appropriate operation.
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
                
            case '-':
                result = num1 - num2;
                break;
                
            case '*':
                result = num1 * num2;
                break;
                
            case '/':
                // Check for division by zero using a nested if-else.
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }
        
        // Display the result if a valid operation was performed.
        if(validOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}
