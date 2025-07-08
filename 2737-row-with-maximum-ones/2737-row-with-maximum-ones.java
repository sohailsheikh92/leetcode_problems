class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int m=mat.length;
        int n=mat[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)
                    cnt++;
            }
            if(cnt>max){
                max=cnt;
                ans[0]=i;
                ans[1]=cnt;
            }
        }
        return ans;
    }
}