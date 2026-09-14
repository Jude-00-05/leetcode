class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights)
        {
            left=Math.max(weight,left);
            right+=weight;
        }
        int ans=right;
        while(left<=right)
        {
            int capacity=left+(right-left)/2;
            int requiredDays=1;
            int currWeight=0;
            for(int weight: weights)
            {
                if(currWeight+weight>capacity){
                    requiredDays++;
                    currWeight=0;
                }
                currWeight+=weight;
            }
            if(requiredDays<=days)
            {
                ans=capacity;
                right=capacity-1;
            }
            else{
                left=capacity+1;
            }
        }
        return ans;
    }
}