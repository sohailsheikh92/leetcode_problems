class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // Adjust k to ensure it's within the bounds of the array length

        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1);            // Reverse the first k elements
        reverse(nums, k, nums.length - 1);  // Reverse the remaining elements
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
