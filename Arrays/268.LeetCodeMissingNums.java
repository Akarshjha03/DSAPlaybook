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
