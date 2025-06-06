/*Maximum Product of Three Numbers:

Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6

Example 2:
Input: nums = [1,2,3,4]
Output: 24

Example 3:
Input: nums = [-1,-2,-3]
Output: -6*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[0] * nums[1] * nums[n-1];
        int product2 = nums[n-1] * nums[n-2] * nums[n-3];

        return Math.max(product1, product2);
    }
}
