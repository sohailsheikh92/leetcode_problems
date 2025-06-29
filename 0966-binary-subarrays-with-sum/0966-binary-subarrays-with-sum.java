class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }

    // Count subarrays with sum ≤ k
    private int countAtMost(int[] nums, int k) {
        if (k < 0) return 0;
        
        int left = 0, sum = 0, count = 0;
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum > k) {
                sum -= nums[left++];
            }
            
            count += (right - left + 1); // all subarrays ending at `right`
        }
        
        return count;
    }
}
