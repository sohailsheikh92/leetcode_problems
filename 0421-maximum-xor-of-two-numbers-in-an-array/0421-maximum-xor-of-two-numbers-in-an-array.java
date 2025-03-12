import java.util.*;

class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXOR = 0, mask = 0;
        Set<Integer> prefixes = new HashSet<>();

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            prefixes.clear();

            for (int num : nums) {
                prefixes.add(num & mask);
            }

            int candidate = maxXOR | (1 << i);

            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ candidate)) {
                    maxXOR = candidate;
                    break;
                }
            }
        }
        return maxXOR;
    }
}
