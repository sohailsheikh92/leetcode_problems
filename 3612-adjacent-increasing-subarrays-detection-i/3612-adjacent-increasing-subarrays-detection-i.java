class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for (int i = 0; i <= n - 2 * k; i++) {
            int j = i;
            int l = 0;
            boolean flag = true;

            // check first subarray
            while (l < k - 1) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    flag = false;
                    break;
                }
                j++;
                l++;
            }

            if (flag) {
                int j1 = j + 1;
                int l1 = 0;
                boolean flag1 = true;

                // check second subarray
                while (l1 < k - 1) {
                    if (nums.get(j1) >= nums.get(j1 + 1)) {
                        flag1 = false;
                        break;
                    }
                    j1++;
                    l1++;
                }

                if (flag1)
                    return true;
            }
        }

        return false;
    }
}
