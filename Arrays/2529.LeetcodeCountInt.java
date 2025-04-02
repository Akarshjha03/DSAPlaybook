class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while(i < n && nums[i] < 0){
            i++;
        }

        while(j >= 0 && nums[j] > 0){
            j--;
        }

        return Math.max(i , n - 1 - j);
    }
}
