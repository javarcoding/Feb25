/*
3.  Find the Second Largest Element 
		Find the second-largest element in the given array. 
*/

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 2, 15};  // Example array

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = arr[0], secondLargest = arr[0];

        // Find the largest element first
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest element
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                if (!found || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Second Largest Element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
