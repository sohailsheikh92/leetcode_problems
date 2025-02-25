class Solution {
    int getBeauty(int freq[]){
        int maxf=0,minf=Integer.MAX_VALUE;
        for(int f : freq){
            if(f>0){
                maxf=Math.max(f,maxf);
                minf=Math.min(f,minf);
            }
        }
        return maxf-minf;
    }
    public int beautySum(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                sum+=getBeauty(freq);
            }
        }
        return sum;
    }
    
}