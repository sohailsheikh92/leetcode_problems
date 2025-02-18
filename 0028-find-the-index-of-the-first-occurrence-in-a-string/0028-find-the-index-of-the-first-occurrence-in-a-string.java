class Solution {
    public int strStr(String haystack, String needle) {
        int ans=haystack.indexOf(needle);
        if(ans==-1)
            return -1;
        return ans;
    }
}