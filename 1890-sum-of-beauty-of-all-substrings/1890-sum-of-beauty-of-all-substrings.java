class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

                int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int val : map.values()){
                max=Math.max(val,max);
                min=Math.min(val,min);
            }
            ans+=max-min;
            }
            
        }
        return ans;
    }
}