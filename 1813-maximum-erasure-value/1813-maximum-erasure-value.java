class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int maxSum=0;
        int i=0,j=0;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        while(j<n){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            sum+=nums[j];
            maxSum=Math.max(sum,maxSum);
            set.add(nums[j]);
            j++;
        }
        return maxSum;
    }
}