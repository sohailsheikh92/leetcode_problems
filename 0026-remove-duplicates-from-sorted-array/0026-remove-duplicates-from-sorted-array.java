class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1])
                nums[cnt++]=nums[i];
        }
        nums[cnt]=nums[n-1];
        cnt=cnt+1;
        return cnt; 
    }
}