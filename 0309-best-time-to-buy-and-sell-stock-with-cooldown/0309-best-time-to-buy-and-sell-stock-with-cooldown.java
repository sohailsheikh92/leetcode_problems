class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int[] M = new int[n];
        int maxDiff = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                maxDiff = Math.max(maxDiff, -prices[i]);
            }
            if (i == 0) {
                M[0] = 0;
            } else if (i == 1) {
                M[1] = Math.max(prices[1] - prices[0], 0);
            } else {
                M[i] = Math.max(M[i - 1], maxDiff + prices[i]);
                maxDiff = Math.max(maxDiff, M[i - 2] - prices[i]);
            }
        }
        return M[n - 1];
    }
}