class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                dp[start][end] = Math.max(nums[start] - dp[start + 1][end], 
                                          nums[end] - dp[start][end - 1]);
            }
        }

        return dp[0][n - 1] >= 0;
    }
}
