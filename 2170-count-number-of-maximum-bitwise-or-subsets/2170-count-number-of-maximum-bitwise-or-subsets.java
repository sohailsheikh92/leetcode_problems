class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        int totalSubsets=1<<n;
        int maxOr=Integer.MIN_VALUE;
        for(int mask=1;mask<totalSubsets;mask++){
            int currOr=0;
            for(int i=0;i<n;i++){
                if ((mask & (1 << i)) != 0)
                    currOr |= nums[i];
            }
            maxOr=Math.max(maxOr,currOr);
        }
        int cnt=0;
        for(int mask=1;mask<totalSubsets;mask++){
            int currOr=0;
            for(int i=0;i<n;i++){
                if ((mask & (1 << i)) != 0)
                    currOr |= nums[i];
            }
            if(maxOr==currOr)
                cnt++;
        }
        return cnt;
    }
}