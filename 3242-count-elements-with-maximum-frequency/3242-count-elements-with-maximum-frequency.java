class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            max=Math.max(entry.getValue(),max);
        }
        int ans=0;
        for(int i : map.values()){
            if(i==max)
                ans+=i;
        }
        return ans;
    }
}