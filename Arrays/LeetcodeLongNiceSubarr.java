/*Longest Nice Subarray
You are given an array nums consisting of positive integers.
We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0.
Return the length of the longest nice subarray.
A subarray is a contiguous part of an array.
Note that subarrays of length 1 are always considered nice.

Example 1:
Input: nums = [1,3,8,48,10]
Output: 3
Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
- 3 AND 8 = 0.
- 3 AND 48 = 0.
- 8 AND 48 = 0.
It can be proven that no longer nice subarray can be obtained, so we return 3.

Example 2:
Input: nums = [3,1,5,11,13]
Output: 1
Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.*/

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1; // Minimum nice subarray length is 1

        for (int i = 0; i < n; i++) {
            int currentLen = 1; // Start with 1 element (always nice)
            
            for (int j = i + 1; j < n; j++) {
                boolean isNice = true;
                
                // Check if nums[i] & nums[j] == 0 for all previous elements
                for (int k = i; k < j; k++) {
                    if ((nums[k] & nums[j]) != 0) {
                        isNice = false;
                        break;
                    }
                }
                
                if (isNice) {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen);
                } else {
                    break; // If not nice, move to the next starting point
                }
            }
        }
        return maxLen;
    }
}
