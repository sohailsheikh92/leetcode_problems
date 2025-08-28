class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                // swap(nums,i,i-1);
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            rev(nums,0,n-1);
            return ;
        }

        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        rev(nums,idx+1,n-1);
    }
    static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    static void rev(int nums[],int a,int b){
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
}