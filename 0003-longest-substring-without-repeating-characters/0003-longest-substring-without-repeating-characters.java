class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0)
            return 0;
        int ans=0;
        boolean seen[]=new boolean[128];
        int i=0,j=0;
        while(j<n){
            if(seen[s.charAt(j)]==false){
                seen[s.charAt(j)]=true;
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else{
                seen[s.charAt(i)]=false;
                i++;
            }
        }

        return ans;
    }
}