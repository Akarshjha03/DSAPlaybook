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
