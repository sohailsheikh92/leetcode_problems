class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int cntbrks=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])
                cntbrks++;
        }
        if(nums[n-1]>nums[0])
            cntbrks++;
        return cntbrks==0 || cntbrks==1;
    }
}