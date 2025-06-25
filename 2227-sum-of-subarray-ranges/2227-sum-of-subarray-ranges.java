class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<n;j++){
                max=Math.max(nums[j],max);
                min=Math.min(nums[j],min);
                int range=max-min;
                sum=sum+range;
            }
        }
        return sum;
    }
}