class NumArray {
    private int[] prefixSum; // Stores prefix sum of the array

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1]; // Extra space to handle index 0 easily
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]; // Compute prefix sum
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left]; // Use the formula
    }
}
