/*

Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
Hint  : Use bitwise  - (~x)
*/

import java.util.Scanner;

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Increment using bitwise operations
        int incrementedNum = -~num; // Equivalent to num + 1

        System.out.println("Incremented number: " + incrementedNum);

        scanner.close();
    }
}
