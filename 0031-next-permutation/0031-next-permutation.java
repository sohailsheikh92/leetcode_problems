class Solution {
    public void nextPermutation(int[] nums) {
    int n = nums.length;
    int idx = -1;

    // Step 1: Find first decreasing element from right
    for (int i = n - 1; i > 0; i--) {
        if (nums[i] > nums[i - 1]) {
            idx = i - 1;
            break;
        }
    }

    // If entire array is in descending order, reverse it
    if (idx == -1) {
        rev(nums, 0, n - 1);
        return;
    }

    // Step 2: Find element just larger than nums[idx]
    for (int i = n - 1; i > idx; i--) {
        if (nums[i] > nums[idx]) {
            // Swap
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
            break;
        }
    }

    // Step 3: Reverse the suffix
    rev(nums, idx + 1, n - 1);
}

// Helper to reverse part of array
void rev(int[] nums, int l, int r) {
    while (l < r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
    }
}


}