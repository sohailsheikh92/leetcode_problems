class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i : nums){
            if(i==0)
                cnt0++;
            if(i==1)
                cnt1++;
            if(i==2)
                cnt2++;
        }
        int k=0;
        for(int i=0;i<cnt0;i++)
            nums[k++]=0;
        for(int i=0;i<cnt1;i++)
            nums[k++]=1;
        for(int i=0;i<cnt2;i++)
            nums[k++]=2;
    }
}