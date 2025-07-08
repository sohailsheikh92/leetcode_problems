import java.util.*;

class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); // sort by start day
        int n = events.length;
        int[][] dp = new int[n][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return helper(events, 0, k, dp);
    }

    private int helper(int[][] events, int idx, int k, int[][] dp) {
        if (idx == events.length || k == 0) return 0;
        if (dp[idx][k] != -1) return dp[idx][k];

        // Option 1: Skip current event
        int skip = helper(events, idx + 1, k, dp);

        // Option 2: Take current event
        int nextIdx = findNext(events, events[idx][1]);
        int take = events[idx][2] + helper(events, nextIdx, k - 1, dp);

        dp[idx][k] = Math.max(skip, take);
        return dp[idx][k];
    }

    private int findNext(int[][] events, int endDay) {
        int low = 0, high = events.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (events[mid][0] > endDay) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
