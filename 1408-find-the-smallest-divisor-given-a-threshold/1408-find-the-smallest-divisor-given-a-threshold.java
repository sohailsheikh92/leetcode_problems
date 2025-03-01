class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxNum=nums[0];
        for(int i=1;i<n;i++){
            maxNum=Math.max(maxNum,nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        int low = 1;  // Start from 1
        int high = maxNum;  // Max possible divisor

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Calculate sum with the current divisor
            int divSum = 0;
            for (int num : nums) {
                divSum += (num + mid - 1) / mid; // Equivalent to ceil(num / mid)
            }

            if (divSum <= threshold) {
                ans = Math.min(mid, ans);
                high = mid - 1; // Try for a smaller divisor
            } else {
                low = mid + 1; // Increase divisor to reduce sum
            }
        }
        return ans;
    }
}