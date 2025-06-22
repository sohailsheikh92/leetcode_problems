class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int ans[]=new int[n];
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    int added=0;
                    for(int k=j+1;k<m;k++){
                        if(nums1[i]<nums2[k]){
                            added++;
                            ans[i]=nums2[k];
                            break;
                            }
                    }
                    if(added==0)
                        ans[i]=-1;
                    break;
                }
            }
        }
        return ans;
    }
}