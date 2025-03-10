/*
11. Write a program to check if a number is positive and even using logical operators 
(&&, ||, !).
*/

import java.util.Scanner;

public class PositiveEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive and even
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else if (num <= 0 || num % 2 != 0) {
            System.out.println(num + " is either not positive or not even.");
        }

        scanner.close();
    }
}
