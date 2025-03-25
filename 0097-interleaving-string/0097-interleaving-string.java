class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        
        // If lengths don't match, s3 can't be an interleaving
        if (m + n != s3.length()) {
            return false;
        }
        
        // dp[i][j] = true if s3[0...(i+j-1)] is an interleaving of s1[0...i-1] and s2[0...j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Base case: empty strings interleave to empty string
        dp[0][0] = true;
        
        // Fill first row (s1 empty, only s2)
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
        }
        
        // Fill first column (s2 empty, only s1)
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1);
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Check if current char matches s1 and previous prefix is valid
                if (s1.charAt(i-1) == s3.charAt(i+j-1)) {
                    dp[i][j] |= dp[i-1][j];
                }
                // Check if current char matches s2 and previous prefix is valid
                if (s2.charAt(j-1) == s3.charAt(i+j-1)) {
                    dp[i][j] |= dp[i][j-1];
                }
            }
        }
        
        return dp[m][n];
    }
}