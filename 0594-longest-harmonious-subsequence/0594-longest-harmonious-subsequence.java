class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }   
        int res=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int len=map.get(key)+map.get(key+1);
                res=Math.max(res,len);
            }
        }
        return res;
    }
}