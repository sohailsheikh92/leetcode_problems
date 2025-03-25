class Solution {
    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int eb = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - eb - fee, profit);
            eb = Math.min(eb, prices[i] - profit);
        }
        return profit;
    }
}