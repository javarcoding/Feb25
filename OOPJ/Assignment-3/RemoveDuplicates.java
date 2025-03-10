/*
 Remove Duplicates from a Sorted Array 
○  Remove duplicate elements from a sorted array without using extra space
*/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // Pointer for the unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { // If new unique element is found
                j++;
                nums[j] = nums[i]; // Move it to the next position
            }
        }
        return j + 1; // New length of the array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
