class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1])
                al.add(nums[i]);
        }
        int ans=0;
        int i=1,j=al.size()-2;
        while(i<=j){
            if(al.get(i)>al.get(i+1) && al.get(i)>al.get(i-1) || al.get(i)<al.get(i+1)&& al.get(i)<al.get(i-1))
                ans++;
            i++;
        }
        return ans;
    }
}