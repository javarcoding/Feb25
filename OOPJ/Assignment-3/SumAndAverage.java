/*
5.  Find Sum and Average 
○  Compute the sum and average of all elements in the array.
*/

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 2, 15};  // Example array

        int sum = 0;
        for (int num : arr) {
            sum += num;  // Add each element to sum
        }

        double average = (double) sum / arr.length;  // Compute average

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
