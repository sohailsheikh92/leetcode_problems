class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=k;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=j)
                j++;
            else    
                break;
        }   
        return j;
    }
}