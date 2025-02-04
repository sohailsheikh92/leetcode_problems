class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>n/3){
                li.add(e.getKey());
            }
        } 
        return li;
    }
}