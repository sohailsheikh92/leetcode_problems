class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
        }

        int maxFreq=Integer.MIN_VALUE;
        for(int val : map.values()){
            if(val>maxFreq)
                maxFreq=val;
        }

        int ans=0;
        for(int val : map.values()){
            if(val==maxFreq)
                ans+=maxFreq;
        }
        return ans;
    }
}