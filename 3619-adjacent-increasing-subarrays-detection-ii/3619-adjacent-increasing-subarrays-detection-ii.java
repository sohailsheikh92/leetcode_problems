class Solution {
    public int maxIncreasingSubarrays(List<Integer> li) {
        int k=0;
        int prev=0;
        int curr=1;
        int n=li.size();
        for(int i=1;i<n;i++){
            if(li.get(i)>li.get(i-1))
                curr++;
            else{
                prev=curr;
                curr=1;
            }
            int half=curr/2;
            k=Math.max(half,k);
            k=Math.max(k,Math.min(prev,curr));
        }
        return k;
    }
}