class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int n=mat.length;
        int m=mat[0].length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            flag=bs(mat[i],t);
            if(flag==true)
                return true;
        }
        return flag;
    }

    static boolean bs(int row[],int t){
        int i=0,j=row.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(row[mid]==t)
                return true;
            else if(row[mid]<t)
                i=mid+1;
            else
                j=mid-1;
        }
        return false;
    }
}