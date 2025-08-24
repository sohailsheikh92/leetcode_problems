class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low = 0;
        int mid = 0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    static void swap(int nums[],int low,int high){
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
}