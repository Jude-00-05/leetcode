class Solution {
    public boolean canPartition(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int num: nums ){
            for(int j=target;j>=num;j--){
                if(dp[j-num]){
                    dp[j]=true;
                }
            }
        }
        return dp[target];

    }
}