class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=0;
        double res=Integer.MIN_VALUE;
        double sum=0;
        double avg=0;        
        while(right<nums.length && left<=right)
        {
            sum+=nums[right];
            right++;
            if(right-left>k){
                sum-=nums[left];
                left++;   
            }
            if(right-left==k){
                avg=sum/k;
                res=Math.max(avg,res);                
            }
            
            

        }
        return res;
    }
}