import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Create DP array with size of the bottom row + 1
        int[] dp = new int[n + 1];
        
        // Start from the bottom row
        for (int i = n - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                // For each element, take min of the two possible paths below
                dp[j] = row.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        
        return dp[0];
    }
}