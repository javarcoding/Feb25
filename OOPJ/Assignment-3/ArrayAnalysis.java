/*
12.  Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
Display the following: 
○  Number of even numbers. 
○  Number of odd numbers. 
○  Number of multiples of 3

*/
import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int evenCount = 0, oddCount = 0, multipleOf3Count = 0;

        // Accept 20 integers from user
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();

            // Check even or odd
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Check if multiple of 3
            if (arr[i] % 3 == 0) {
                multipleOf3Count++;
            }
        }
        sc.close();

        // Display results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);
    }
}
