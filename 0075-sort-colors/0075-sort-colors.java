class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i : nums){
            if(i==0)    
                cnt0++;
            else if(i==1)
                cnt1++;
            else 
                cnt2++;
        }
        int i=0;
        for(;i<cnt0;i++)
            nums[i]=0;
        int j=i;
        for(;j<cnt0+cnt1;j++)
            nums[j]=1;
        int k=j;
        for(;k<n;k++)
            nums[k]=2;
    }
}