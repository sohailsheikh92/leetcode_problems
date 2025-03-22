class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int square = 1; square * square <= i; square++) {
                if (!dp[i - square * square]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
