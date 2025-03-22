class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int end = start + len - 1;
                dp[start][end] = Integer.MAX_VALUE;

                for (int k = start; k <= end; k++) {
                    int cost = k + Math.max(k > start ? dp[start][k - 1] : 0, 
                                            k < end ? dp[k + 1][end] : 0);
                    dp[start][end] = Math.min(dp[start][end], cost);
                }
            }
        }
        return dp[1][n];
    }
}
