import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length / 3, maxCoins = 0;
        
        for (int i = piles.length - 2; i >= n; i -= 2) {
            maxCoins += piles[i];
        }
        
        return maxCoins;
    }
}
