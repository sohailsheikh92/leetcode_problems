class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int n=nums.length;
        if(n==1)
            return 1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1])
                nums[k++]=nums[i-1];
        }
        // if(nums[n-1]!=nums[n-2])
            nums[k++]=nums[n-1];
        return k;
    }
}