/*
Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. 
Hint  : Use  n & (n - 1) 

*/

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // Clears the rightmost set bit
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}

/*
n & (n - 1) removes the rightmost set bit in n.
We keep applying this operation until n becomes 0, counting how many times it runs.

Step-by-step process:
1101 & 1100 → 1100 (count = 1)
1100 & 1011 → 1000 (count = 2)
1000 & 0111 → 0000 (count = 3)
*/