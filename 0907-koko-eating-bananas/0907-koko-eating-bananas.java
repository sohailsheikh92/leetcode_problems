class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i : piles)
            max = Math.max(max, i);

        int low = 1;
        int high = max;

        while (low <= high) {
            long mid = low + (high - low) / 2; // Use long to avoid overflow
            long sum = 0; // Use long for large sums

            for (int i : piles) {
                sum += (i + mid - 1) / mid; // Correctly rounds up division
                if (sum > h) break; // Stop early if sum exceeds h
            }

            if (sum > h)
                low = (int) mid + 1;
            else
                high = (int) mid - 1;
        }
        return low;
    }
}
