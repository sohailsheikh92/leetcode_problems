class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i  : nums){
            sum+=i;
            ans=Math.max(ans,sum);
            if(sum<0)
                sum=0;
        }
        return ans;
    }
}