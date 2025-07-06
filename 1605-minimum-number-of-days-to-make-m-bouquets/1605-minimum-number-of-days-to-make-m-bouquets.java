class Solution {
    public int minDays(int[] arr, int m, int k) {
        int n=arr.length;
        if(m*k>n)
            return -1;
        int max=Integer.MIN_VALUE;
        for(int i:arr)
            max=Math.max(i,max);
        int low=1,high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMakeABouquet(arr,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }

        return ans;
    }

    static boolean canMakeABouquet(int arr[],int mid,int m,int k){
        int cnt=0;
        int bloomed=0;
        for(int i : arr){
            if(mid>=i){
                cnt++;
                if(cnt==k){
                    bloomed=bloomed+1;
                    cnt=0;
                }
            }else
                cnt=0;
                
            if(bloomed>=m)
                return true;
        }
        return false;
    } 
}