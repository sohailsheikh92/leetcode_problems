class Solution {
    public String longestPalindrome(String s) {
        int max=0,start=0,end=0,n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPali(s,i,j)){
                    if(max<j-i+1){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }

    static boolean isPali(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}