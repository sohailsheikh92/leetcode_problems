class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Loop from 2n - 1 down to 0
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            // Remove all elements smaller or equal to current
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }

            // For the first pass, fill the result
            if (i < n) {
                if (!stack.isEmpty()) {
                    res[i] = stack.peek(); // Next greater
                } else {
                    res[i] = -1; // No greater element
                }
            }

            // Push current element to stack
            stack.push(curr);
        }

        return res;
    }
}
