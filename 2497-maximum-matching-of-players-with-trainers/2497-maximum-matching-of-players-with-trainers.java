class Solution {
    public int matchPlayersAndTrainers(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int max=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                max++;
                i++;
                j++;
            }else   
                j++;
        }
        return max;
    }
}