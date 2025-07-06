class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i :  nums)
            max=Math.max(i,max);
        int low=1,high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i : nums){
                int res=i/mid;
                sum+=(i%mid==0)?res:res+1;
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else
                low=mid+1;
        }
        return ans;
    }
}