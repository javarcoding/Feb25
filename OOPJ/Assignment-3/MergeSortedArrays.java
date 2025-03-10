/*
8.  Merge Two Sorted Arrays 
○  Merge two sorted arrays into a single sorted array without using extra space
*/

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int gap = (n + m) / 2 + (n + m) % 2; // Initial gap size

        while (gap > 0) {
            int i = 0, j = gap;
            
            while (j < (n + m)) {
                // Determine indices in arr1 and arr2
                int first = (i < n) ? arr1[i] : arr2[i - n];
                int second = (j < n) ? arr1[j] : arr2[j - n];

                // Swap if needed
                if (first > second) {
                    if (i < n && j < n) { // Both in arr1
                        swap(arr1, i, arr1, j);
                    } else if (i < n) { // arr1[i] and arr2[j-n]
                        swap(arr1, i, arr2, j - n);
                    } else { // Both in arr2
                        swap(arr2, i - n, arr2, j - n);
                    }
                }
                i++;
                j++;
            }
            gap = (gap > 1) ? (gap / 2 + gap % 2) : 0;
        }
    }

    private static void swap(int[] arr1, int i, int[] arr2, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}
