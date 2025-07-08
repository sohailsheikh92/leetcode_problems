class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //using binary search most optimal among all
        int i=0;
        int j=matrix.length*matrix[0].length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int row=mid/matrix[0].length;
            int col=mid%matrix[0].length;
            int curr=matrix[row][col];
            if(curr==target)
                return true;
            else if(curr<target)
                i=mid+1;
            else 
                j=mid-1;
        }
        return false;
    }
}