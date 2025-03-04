class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
                ans.append(ch);
        }
        String lower=ans.toString().toLowerCase();
        int m=lower.length();
        int i=0;
        int j=m-1;
        while(i<j){
            if(lower.charAt(i)!=lower.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}