class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;
        
        // dp[i] = number of ways to decode s[0...i-1]
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty string has 1 way
        dp[1] = 1; // First character has 1 way if not '0'
        
        for (int i = 2; i <= n; i++) {
            // Check single digit (s[i-1])
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            
            // Check two digits (s[i-2] and s[i-1])
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (s.charAt(i - 2) != '0' && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[n];
    }
}