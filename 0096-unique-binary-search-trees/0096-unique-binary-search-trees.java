class Solution {
    public int numTrees(int n) {
        // dp[i] = number of unique BSTs with i nodes
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 1; // Empty tree
        dp[1] = 1; // One node
        
        // Build DP array
        for (int nodes = 2; nodes <= n; nodes++) {
            for (int root = 1; root <= nodes; root++) {
                int left = root - 1;        // Nodes in left subtree
                int right = nodes - root;   // Nodes in right subtree
                dp[nodes] += dp[left] * dp[right];
            }
        }
        
        return dp[n];
    }
}