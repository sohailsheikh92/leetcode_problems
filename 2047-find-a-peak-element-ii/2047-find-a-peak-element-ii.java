class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int i=0,j=m-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int maxRowIndex=findMaxElement(mat,n,mid);
            int left=(mid-1>=0)?mat[maxRowIndex][mid-1]:-1;
            int right=(mid+1<m)?mat[maxRowIndex][mid+1]:-1;
            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right)
                return new int[]{maxRowIndex,mid};
            else if(mat[maxRowIndex][mid]<left)
                j=mid-1;
            else
                i=mid+1;
        }
        return new int[]{-1,-1};
    }

    static int findMaxElement(int mat[][],int n,int mid){
        int maxEle=-1;
        int index=0;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxEle){
                maxEle=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
}