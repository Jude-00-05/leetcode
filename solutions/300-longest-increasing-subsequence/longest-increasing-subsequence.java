class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        int[] dp=new int[len];
        Arrays.fill(dp,1);  
        int maxLen=1;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[j]+1>dp[i])
                        dp[i]=dp[j]+1;
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }  
        return maxLen;
    }
}