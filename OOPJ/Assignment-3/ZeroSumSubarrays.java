/*
 Write a Java program to print all sub-arrays with 0 sum present in a given array of integers. 
Example: 
Input : 
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 } 
nums2 = { 1, 2, -3, 4, 5, 6 } 
nums3= { 1, 2, -2, 3, 4, 5, 6 } 
Output: 
Sub-arrays with 0 sum : [1, 3, -7, 3] 
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2] 
Sub-arrays with 0 sum : [1, 2, -3] 
Sub-arrays with 0 sum : [2, -2]
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Add a dummy entry to handle cases where subarray starts from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        System.out.println("Sub-arrays with 0 sum:");
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If sum already exists in map, it means a subarray with 0 sum is found
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(subArrayToString(nums, startIndex + 1, i));
                }
            }

            // Store index in the map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    // Helper function to convert sub-array to string
    private static String subArrayToString(int[] nums, int start, int end) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = start; i <= end; i++) {
            sb.append(nums[i]);
            if (i < end) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] testArrays = {
            {1, 3, -7, 3, 2, 3, 1, -3, -2, -2},
            {1, 2, -3, 4, 5, 6},
            {1, 2, -2, 3, 4, 5, 6}
        };

        for (int i = 0; i < testArrays.length; i++) {
            System.out.println("\nInput array " + (i + 1)
