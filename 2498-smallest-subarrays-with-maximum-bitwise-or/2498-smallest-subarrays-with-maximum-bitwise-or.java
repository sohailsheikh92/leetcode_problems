class Solution {
    public int[] smallestSubarrays(int[] nums) {
        final int MAX_BIT = 30;  // since numbers fit within 30 bits
        int n = nums.length;
        int[] ans = new int[n];
        int[] nearest = new int[MAX_BIT];
        Arrays.fill(nearest, n);  // initialize next-index of each bit to 'out of bounds'

        // each position requires at least itself, so initialize answer array to 1
        Arrays.fill(ans, 1);

        // scan from rightmost index down to 0
        for (int i = n - 1; i >= 0; --i) {
            int farthest = i;
            for (int bit = 0; bit < MAX_BIT; ++bit) {
                if (((nums[i] >> bit) & 1) != 0) {
                    nearest[bit] = i;  // this bit is present at index i
                }
                if (nearest[bit] < n) {
                    // extend to cover this bit's next occurrence
                    farthest = Math.max(farthest, nearest[bit]);
                }
            }
            ans[i] = farthest - i + 1;
        }

        return ans;
    }
}
