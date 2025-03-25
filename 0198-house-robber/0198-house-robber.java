class Solution {
    public int rob(int[] nums) {
        // Handle edge cases
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int prev = 0;  // Max money up to two houses ago
        int curr = 0;  // Max money up to the previous house
        
        // Iterate through each house
        for (int num : nums) {
            int temp = curr;  // Store current value before updating
            curr = Math.max(curr, prev + num);  // Max of skipping or robbing current house
            prev = temp;  // Move prev forward
        }
        
        return curr;  // Final result
    }
}