class Solution {
    public int countHomogenous(String s) {
        int n=s.length();
        int len =1 ;
        long ans=1;
        int mod=1000000007;
        char ch=s.charAt(0);
        for(int i=1;i<n;i++){
            if(ch==s.charAt(i))
                len++;
            else{
                ch=s.charAt(i);
                len=1;
            }
            ans=(ans+len)%mod;
        }
        return (int)ans;
    }
}