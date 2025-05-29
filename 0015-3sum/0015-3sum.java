class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                        continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int ans=nums[i]+nums[j]+nums[k];
                if(ans==0){
                    List<Integer> al=new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    li.add(al);
                    
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }
                else if(ans<0)
                    j++;
                else
                    k--;
            }
        }
        return li;
    }
}