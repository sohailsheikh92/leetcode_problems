class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        // Create DP array
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize first row (cost to match empty word2 with word1 prefix)
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Deleting i characters from word1
        }
        
        // Initialize first column (cost to match empty word1 with word2 prefix)
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Inserting j characters into word1
        }
        
        // Fill the DP array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No operation needed
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // Replace
                        Math.min(dp[i - 1][j], // Delete
                                dp[i][j - 1])  // Insert
                    );
                }
            }
        }
        
        return dp[m][n];
    }
}