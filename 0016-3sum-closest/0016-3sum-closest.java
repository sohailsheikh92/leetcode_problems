import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr); // O(N log N)
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2]; // Initialize with the first triplet

        for (int i = 0; i < n - 2; i++) { // O(N)
            int j = i + 1, k = n - 1;

            while (j < k) { // O(N) per i
                int sum = arr[i] + arr[j] + arr[k];

                // Update closestSum if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Move pointers
                if (sum > target) {
                    k--; // Reduce the sum
                } else if (sum < target) {
                    j++; // Increase the sum
                } else {
                    return sum; // If exactly equal, return immediately
                }
            }
        }
        return closestSum;
    }
}
