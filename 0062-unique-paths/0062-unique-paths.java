class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D DP array
        int[][] dp = new int[m][n];
        
        // Initialize first row and column to 1 (only one way to reach any cell)
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // Fill the DP array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1]; // Paths from above + paths from left
            }
        }
        
        return dp[m-1][n-1];
    }
}