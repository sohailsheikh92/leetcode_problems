class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0; // Farthest index we can reach
        
        for (int i = 0; i < n; i++) {
            // If we can't reach the current index, return false
            if (i > maxReach) {
                return false;
            }
            // Update the farthest we can reach from here
            maxReach = Math.max(maxReach, i + nums[i]);
            // If we can reach or exceed the last index, return true
            if (maxReach >= n - 1) {
                return true;
            }
        }
        
        return true; // Only reached if n=1 and loop completes
    }
}