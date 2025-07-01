class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq=0;
        int maxLen=0;
        int count[]=new int[26];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'A']++;
            maxFreq=Math.max(maxFreq,count[ch-'A']);
            while((i-j+1)-maxFreq>k){
                count[s.charAt(j)-'A']--;
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }    
        return maxLen;
    }
}