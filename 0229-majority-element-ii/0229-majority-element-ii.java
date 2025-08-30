class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        int cnt = 1;
        int threshold = nums.length / 3;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                if (cnt > threshold) {
                    li.add(nums[i - 1]);
                }
                cnt = 1; // reset
            }
        }

        // check the last streak
        if (cnt > threshold) {
            li.add(nums[nums.length - 1]);
        }

        return li;
    }
}

