class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1)
            return ;
        k%=nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }

    static void rev(int nums[],int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}