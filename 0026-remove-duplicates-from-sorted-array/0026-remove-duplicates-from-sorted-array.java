class Solution {
    public int removeDuplicates(int[] arr) {
        // if(arr.length==0)
        //     return 0;
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
                arr[k++]=arr[i];
        }
        // if(arr[arr.length-1]!=arr[arr.length-2])
            arr[k++]=arr[arr.length-1];
        return k;
    }
}