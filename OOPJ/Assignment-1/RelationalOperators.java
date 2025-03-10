/*
10. Write a program to compare two integers using 
all relational operators (==, !=, >, <, >=, <=) and display the results.
    
*/
import java.util.Scanner; // Import Scanner for user input

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Comparing the numbers using relational operators
        System.out.println("\nComparison Results:");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2)); // Equal to
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2)); // Not equal to
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));   // Greater than
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));   // Less than
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2)); // Greater than or equal to
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2)); // Less than or equal to

        
    }
}
