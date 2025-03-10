/*
12. Write a program to demonstrate the use of 
assignment operators (=, +=, -=, *=, /=, %=) on two integers.
*/

import java.util.Scanner; // Import Scanner for user input

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int value = scanner.nextInt();

        // Demonstrating assignment operators
        System.out.println("\nInitial num = " + num);

        num += value; // num = num + value
        System.out.println("After num += value: " + num);

        num -= value; // num = num - value
        System.out.println("After num -= value: " + num);

        num *= value; // num = num * value
        System.out.println("After num *= value: " + num);

        num /= value; // num = num / value (integer division)
        System.out.println("After num /= value: " + num);

        num %= value; // num = num % value (remainder)
        System.out.println("After num %= value: " + num);


    }
}
