class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;
        List<Integer> al= new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                al.add(mat[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                al.add(mat[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    al.add(mat[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    al.add(mat[i][left]);
                left++;
            }
        }
        return al;
    }
}