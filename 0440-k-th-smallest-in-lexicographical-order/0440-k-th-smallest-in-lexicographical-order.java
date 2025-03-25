class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; // Because we start from 1

        while (k > 0) {
            long steps = countSteps(n, curr, curr + 1);
            if (steps <= k) {
                // Move to the next number in the same level
                curr++;
                k -= steps;
            } else {
                // Move to the next level (deeper in the trie)
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    private long countSteps(int n, long first, long last) {
        long steps = 0;
        while (first <= n) {
            steps += Math.min(n + 1, last) - first;
            first *= 10;
            last *= 10;
        }
        return steps;
    }
}
