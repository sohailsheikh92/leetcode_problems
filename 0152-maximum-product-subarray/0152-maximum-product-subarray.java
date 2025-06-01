class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr=1;
            for(int j=i;j<nums.length;j++){
                curr*=nums[j];
                ans=Math.max(curr,ans);
            }
        }
        return ans;
    }
}