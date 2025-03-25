class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0; // No jumps needed if length is 0 or 1
        
        int jumps = 0;      // Number of jumps taken
        int currentMax = 0; // Farthest index reachable with current jumps
        int nextMax = 0;    // Farthest index reachable with one more jump
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest we can reach with one more jump
            nextMax = Math.max(nextMax, i + nums[i]);
            
            // If we've reached the limit of the current jump
            if (i == currentMax) {
                jumps++;            // Take a jump
                currentMax = nextMax; // Update currentMax to the new farthest reach
                
                // If we can already reach the end, no need to continue
                if (currentMax >= n - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}