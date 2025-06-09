class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans=-1;
        for(int i : nums){
            if(set.contains(i)){
                return i;
            }else
                set.add(i);
        }
        return ans;
    }
}