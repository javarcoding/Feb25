/*
2.  Reverse an Array 
		Reverse the given array in place. 
*/
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 2, 15}; 
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        reverseArray(arr);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
}
