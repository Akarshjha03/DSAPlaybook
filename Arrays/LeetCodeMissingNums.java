/*Missing Numbers:
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8*/

class Solution {
    public int missingNumber(int[] nums) {

        // Initialize a variable to store the XOR result
        int allXOR = 0;

        // Perform XOR on all numbers in the range [0, n]
        // nums.length represents n since the array has n numbers (0 to n)
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;  // XOR with the current index
        }

        // Perform XOR on all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;  // XOR with the number in the array
        }

        // The result will be the missing number since XOR cancels out duplicate numbers
        return allXOR;
    }
}
