class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        int count=0;// This will store the total number of arithmetic subarrays
        int current=0;// This stores the number of arithmetic subarrays that can end at the current position
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                current++;
                count+=current;
            }else{
                current=0;
            }
        }
        return count;
    }
}