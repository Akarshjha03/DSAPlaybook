/*Remove Duplicates from a Sorted Array
Given a sorted array, remove duplicates in-place and return the new length of the array.*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}



/*//basic code:
public class Main {
    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5}; // Sorted array with duplicates
        int n = arr.length;

        if (n == 0) return; // Edge case: Empty array

        int i = 0; // Pointer to track unique elements

        // Loop through the array
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) { // If a new unique element is found
                i++; 
                arr[i] = arr[j]; // Store it in the correct position
            }
        }

        // Print the new length
        System.out.println("New length: " + (i + 1));

        // Print the modified array
        System.out.print("Modified array: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}*/


