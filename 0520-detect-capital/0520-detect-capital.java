class Solution {
    public boolean detectCapitalUse(String s) {
        int n=s.length();
        int cntupper=0;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i)))
                cntupper++;
        }

        if(cntupper==0 || cntupper==n)
            return true;
        if(cntupper==1 && Character.isUpperCase(s.charAt(0)))
            return true;
        return false;
    }
}