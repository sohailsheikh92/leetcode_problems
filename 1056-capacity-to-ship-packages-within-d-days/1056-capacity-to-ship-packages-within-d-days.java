class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int n=arr.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i : arr){
            low=Math.max(low,i);
            high+=i;
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysRequired=required(arr,mid);
            if(daysRequired<=days){
                ans=mid;
                high=mid-1;
            }else
                low=mid+1;
        }
        return ans;
    }

    static int required(int arr[],int j){
        int load=0;
        int days=1;
        for(int i : arr){
            if(load+i>j){
                days=days+1;
                load=i;
            }else
                load+=i;
        }
        return days;
    }


}