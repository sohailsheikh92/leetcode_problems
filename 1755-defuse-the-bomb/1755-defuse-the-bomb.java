class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k==0){
            return ans;
        }
        int n=code.length;
        int start=1,end=k,sum=0;
        if(k<0){
            start=n-Math.abs(k);
            end=n-1;
        }
        for(int i=start;i<=end;i++)
            sum+=code[i%n];
        for(int i=0;i<n;i++){
            ans[i]=sum;
            sum-=code[start%n];
            sum+=code[(end+1)%n];
            start++;
            end++;
        }
        return ans;
        
    }
}