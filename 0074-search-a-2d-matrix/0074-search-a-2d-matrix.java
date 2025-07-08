class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(t>=matrix[i][0] && t<=matrix[i][m-1]){
                return binarysearch(matrix[i],t);
            }
        }

        return false;
    }


    static boolean binarysearch(int matrix[],int t){
        int i=0,j=matrix.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(matrix[mid]==t)
                return true;
            else if(matrix[mid]>t)
                j=mid-1;
            else
                i=mid+1;
        }
        return false;
    }
}