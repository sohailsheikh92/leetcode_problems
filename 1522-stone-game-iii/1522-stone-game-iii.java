import java.util.*;

class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[n] = 0; // Base case: No stones left, score is 0.

        for (int i = n - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = 0; j < 3 && i + j < n; j++) {
                sum += stoneValue[i + j];
                dp[i] = Math.max(dp[i], sum - dp[i + j + 1]);
            }
        }

        if (dp[0] > 0) return "Alice";
        else if (dp[0] < 0) return "Bob";
        else return "Tie";
    }
}
