/*
4.  Count Even and Odd Numbers 
		Count the number of even and odd numbers in an array
*/
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 2, 15};  // Example array

        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;  // If number is divisible by 2, it's even
            } else {
                oddCount++;   // Otherwise, it's odd
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}
