/*
1.  Find the Largest and Smallest Element 
		Given an array, find the smallest and largest elements in it. 

*/

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 2, 15};  
        
        int min = arr[0];  // Initialize min with first element
        int max = arr[0];  // Initialize max with first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // Update min
            }
            if (arr[i] > max) {
                max = arr[i];  // Update max
            }
        }

        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }
}
