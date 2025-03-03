class Solution {
    public int maxDepth(String s) {
        // if(s.length)
        int ans=0;
        int depth=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                depth++;
                ans=Math.max(depth,ans);
            }
            else if(ch==')')
                depth--;
            else
                continue;
        }
        return ans;
    }
}