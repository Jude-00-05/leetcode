class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        //test
        
        for(int i=1;i<n+1;i++){
            int bit=i&1;
            int curr=i>>1;
            
            dp[i]=dp[curr]+bit;
        }
        return dp;
    }
}