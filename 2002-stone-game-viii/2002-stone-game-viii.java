class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = stones[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + stones[i];
        }

        int bestScore = prefixSum[n - 1]; // Starting from the last possible move
        for (int i = n - 2; i >= 1; i--) {
            bestScore = Math.max(bestScore, prefixSum[i] - bestScore);
        }

        return bestScore;
    }
}
