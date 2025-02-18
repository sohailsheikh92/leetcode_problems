class Solution {
    public boolean rotateString(String s, String goal) {
        String spluss=s+s;
        if(spluss.contains(goal) && s.length()==goal.length())
            return true;
        return false;
    }
}