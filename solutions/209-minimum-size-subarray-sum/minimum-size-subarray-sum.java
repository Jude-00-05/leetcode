class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int total=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            total+=nums[r];
            while(total>=target){
                min=Math.min(min,r-l+1);
                total-=nums[l];
                l+=1;
            }
            

        }
        if (min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}