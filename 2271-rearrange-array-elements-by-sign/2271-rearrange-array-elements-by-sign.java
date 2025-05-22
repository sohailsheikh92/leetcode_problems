class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int pos=0,neg=1;
        for(int i : nums){
            if(i>0){
                ans[pos]=i;
                pos+=2;
            }
            else{
                ans[neg]=i;
                neg+=2;
            }
        }
        return ans;
    }
}