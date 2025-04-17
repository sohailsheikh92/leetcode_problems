// import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        // Step 1: Convert array to ArrayList for dynamic size handling
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int res = 0;

        // Step 2: Repeat until the list is sorted
        while (!isSorted(list)) {
            int minIndex = findMinPairIndex(list);

            // Merge the pair
            int sum = list.get(minIndex) + list.get(minIndex + 1);
            list.set(minIndex, sum);
            list.remove(minIndex + 1);

            res++; // Count the operation
        }

        return res;
    }

    // Check if the list is non-decreasing
    private boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }

    // Find index of leftmost adjacent pair with minimum sum
    private int findMinPairIndex(List<Integer> list) {
        int minSum = list.get(0) + list.get(1);
        int minIndex = 0;

        for (int i = 1; i < list.size() - 1; i++) {
            int sum = list.get(i) + list.get(i + 1);
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
