/*
11.  Find a Subarray with Given Sum 
○  Given an array of integers, find the subarray that sums to a given value S.

*/
import java.util.*;

public class SubarrayWithGivenSum {
    public static int[] findSubarray(int[] arr, int S) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink the window if sum exceeds S
            while (sum > S && start <= end) {
                sum -= arr[start];
                start++;
            }

            // If sum equals S, return indices
            if (sum == S) {
                return new int[]{start, end};
            }
        }

        return new int[]{-1}; // No subarray found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int S = 33;
        int[] result = findSubarray(arr, S);

        if (result.length == 1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        }
    }
}
