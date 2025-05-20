class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int majority=nums.length/2;
        for(var e : map.entrySet()){
            if(e.getValue()>majority)
                return e.getKey();
        }
        return -1;
    }
}