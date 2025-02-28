class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int nby2=n/2;
        int ans[]=new int[n];
        int pos[]=new int[nby2];int j=0;
        int neg[]=new int[nby2];int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[j]=nums[i];
                j++;
            }else{
                neg[k]=nums[i];
                k++;
            }
        }
        int x=0;
        int y=0;
        for(int m=0;m<n;m++){
            if(m%2==0){
                ans[m]=pos[x];
                x++;
            }
            else{
                ans[m]=neg[y];
                y++;
            }
        }

        
        return ans;
    }
}