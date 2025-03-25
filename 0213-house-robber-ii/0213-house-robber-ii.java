class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        // Case 1: Exclude the first house (rob from index 1 to n-1)
        int max1 = robLinear(nums, 1, n - 1);
        
        // Case 2: Exclude the last house (rob from index 0 to n-2)
        int max2 = robLinear(nums, 0, n - 2);
        
        // Return the maximum of the two cases
        return Math.max(max1, max2);
    }
    
    // Helper function to solve the linear House Robber problem for a range [start, end]
    private int robLinear(int[] nums, int start, int end) {
        int prev = 0;  // Max money up to two houses ago
        int curr = 0;  // Max money up to the previous house
        
        for (int i = start; i <= end; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }
        
        return curr;
    }
}