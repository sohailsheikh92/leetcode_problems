class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        // Iterate through the array
        for (int i = 1; i < prices.length; i++) {
            // If current price is higher than previous, add the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
}