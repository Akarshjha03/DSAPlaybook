class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices
                }
            }
        }
        return new int[]{}; // Return empty if no solution is found (though it's guaranteed to exist)
    }
}

/*How Does LeetCode Call This Code?
LeetCode internally runs something like this:

java
Copy
Edit
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15}; 
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Expected Output: [0, 1]
    }
}
This main method is written by LeetCode internally to test your function.
It creates an instance of Solution and calls twoSum(nums, target).
nums = {2, 7, 11, 15} and target = 9 are passed as arguments.*/

