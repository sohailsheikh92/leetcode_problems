class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]<min)
                min=nums[i];
        }
        if(min==max)
            return min;
        int ans=1;
        for(int i=2;i<=max;i++){
            if(min%i==0 && max%i==0)
                ans=i;
        }
        return ans;
    }
}