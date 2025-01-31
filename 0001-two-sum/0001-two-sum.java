class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];  // Complement we need

            if (map.containsKey(req)) {  // Check if complement is present
                return new int[]{map.get(req), i};  // Return indices
            }

            map.put(nums[i], i);  // Store the number and its index
        }

        return null;  // No solution found
    }
}
