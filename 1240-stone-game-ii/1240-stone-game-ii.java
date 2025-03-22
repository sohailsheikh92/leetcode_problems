import java.util.*;

class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        int[] suffixSum = new int[n];
        
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = piles[i] + suffixSum[i + 1];
        }

        return helper(piles, dp, suffixSum, 0, 1);
    }

    private int helper(int[] piles, int[][] dp, int[] suffixSum, int i, int M) {
        if (i >= piles.length) return 0;
        if (2 * M >= piles.length - i) return suffixSum[i];
        if (dp[i][M] != 0) return dp[i][M];

        int minOpponentStones = Integer.MAX_VALUE;
        for (int X = 1; X <= 2 * M; X++) {
            minOpponentStones = Math.min(minOpponentStones, helper(piles, dp, suffixSum, i + X, Math.max(M, X)));
        }

        dp[i][M] = suffixSum[i] - minOpponentStones;
        return dp[i][M];
    }
}
