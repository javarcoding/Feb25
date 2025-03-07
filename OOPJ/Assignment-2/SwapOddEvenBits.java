/*
Q15:  Implement a program to swap  odd and even bits  of a number using bitwise 
operators. 
Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 

*/

import java.util.Scanner;

public class SwapOddEvenBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        scanner.close();

        // Mask to get even-positioned bits (bits at positions 0, 2, 4, ...)
        int evenBits = x & 0xAAAAAAAA; 

        // Mask to get odd-positioned bits (bits at positions 1, 3, 5, ...)
        int oddBits = x & 0x55555555; 

        // Right shift even bits
        evenBits >>= 1;

        // Left shift odd bits
        oddBits <<= 1;

        // Combine the swapped bits
        int swapped = evenBits | oddBits;

        System.out.println("Number after swapping odd and even bits: " + swapped);
    }
}


/*

input x = 23 (Binary: 0001 0111)
Use bit masks:

0xAAAAAAAA (10101010 10101010 ...) selects even-positioned bits (index 0, 2, 4...).
0x55555555 (01010101 01010101 ...) selects odd-positioned bits (index 1, 3, 5...).

1] Extract even bits:
	Right shift-
	int evenBits = x & 0xAAAAAAAA;
	
	0001 0111
&	1010 1010
	------------
	0000 0010  (even bits)
	
	After right shift: 0000 0001
	
2] Extract odd bits:
	Left shift-
	 int oddBits = x & 0x55555555;
	
	0001 0111
& 	0101 0101
	------------
	0001 0101  (odd bits)
	
	After left shift: 0010 1010
	
3] combine both odd and even swapped bits. use the bitwise OR (|) operation.
	0000 0001
	0010 1010
	------------
	0010 1011    result = 43
*/