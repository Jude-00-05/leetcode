class Solution {
    public int maxSubArray(int[] nums) {
      int max = Integer.MIN_VALUE;
      int currSum = 0;  

      for(int i:nums){
        if(currSum<0) currSum=0;
        currSum+=i;
        max=Math.max(currSum,max);
      } 
      return max; 
    }
}