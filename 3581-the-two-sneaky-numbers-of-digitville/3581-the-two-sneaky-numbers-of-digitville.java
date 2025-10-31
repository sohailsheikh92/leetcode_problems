class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);
        int ans[]=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                ans[i++]=entry.getKey();
            }
            if(i==2)
                break;
        }
        return ans;
    }
}