class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(temp.charAt(0)=='+' || temp.charAt(2)=='+')
                ans+=1;
            else
                ans-=1;
        }
        return ans;
    }
}