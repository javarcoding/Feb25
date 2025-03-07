/*
Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print 
the result without using  if-else 
*/

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Using bitwise AND to check odd/even and printing directly
        System.out.println("The number is: " + ((num & 1) == 0 ? "Even" : "Odd"));

        scanner.close();
    }
}
