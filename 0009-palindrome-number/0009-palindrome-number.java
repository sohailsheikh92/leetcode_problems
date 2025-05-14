class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int sign =1;
        int origin=x;
        if(x<0)
            sign=-1;
        while(x>0){
            int last_dig=x%10;
            rev=(rev*10)+last_dig;
            x/=10;
        }
        rev=rev*sign;
        if(rev==origin)
            return true;

        return false;
    }

}