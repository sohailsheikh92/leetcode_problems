class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int sign=1;
        s=s.trim();
        if(s.length()==0)
            return 0;
        Set<Integer> set=new HashSet<>();
        if(s.charAt(0)=='-')
            sign=-1;
        for(int i=0;i<s.length();i++){
            if(i==0 && (s.charAt(i)=='+' || s.charAt(i)=='-'))
                continue;
            if(Character.isDigit(s.charAt(i))){
                ans=ans*10+(s.charAt(i)-'0');
                if(ans*sign>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if(ans*sign<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            else
                break;
        }      
        int res=(int)ans*sign;
        return res;
    }
}