/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans=Integer.MAX_VALUE;
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low+1)/2;
            if(isBadVersion(mid)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}