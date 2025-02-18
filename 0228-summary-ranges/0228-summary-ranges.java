// import java.uti

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Check if current number is not consecutive with the previous one
            if (nums[i] != nums[i - 1] + 1) {
                // Add the current range
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                // Update the start for the new range
                start = nums[i];
            }
        }
        
        // Add the last range
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1, 0, 1, 2, 6, 7, 8, 10};
        System.out.println(sol.summaryRanges(nums));  // Output: [-1->2, 6->8, 10]
    }
}
