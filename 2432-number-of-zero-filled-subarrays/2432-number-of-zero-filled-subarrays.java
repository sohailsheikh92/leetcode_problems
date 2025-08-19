class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int cons=0;
        int n=nums.length;
        boolean flag=false;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(flag)
                    cons++;
                else{
                    cons=1;
                    flag=true;
                }
            }
            else{
                cons=0;
                flag=false;
            }
            temp[i]=cons;
        }
        for(int i=0;i<n;i++){
            ans+=temp[i];
        }
        return ans;
    }
}