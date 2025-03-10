/*
 Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer 
and store all the even numbers in an array even[ ] and all the odd numbers in another array 
odd[ ]. Finally, print the elements of the even & the odd array.
*/

import java.util.*;

public class EvenOddSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];  // Array to store 20 numbers
        ArrayList<Integer> even = new ArrayList<>(); // To store even numbers
        ArrayList<Integer> odd = new ArrayList<>();  // To store odd numbers

        // Accept 20 numbers
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();

            // Separate even and odd numbers
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        sc.close();

        // Print even numbers
        System.out.println("Even Numbers: " + even);

        // Print odd numbers
        System.out.println("Odd Numbers: " + odd);
    }
}
