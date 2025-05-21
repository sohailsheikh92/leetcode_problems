class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i])
                nums[ans++]=nums[i-1];
        }
        nums[ans++]=nums[nums.length-1];
        return ans;
    }
}