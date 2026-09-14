class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MAX_VALUE;
        int ans=0;
        for(int pile:piles)
            right=Math.max(pile,right);
        while(left<=right)
        {
            int speed=left+(right-left)/2;
            int hours=0;
            for(int pile:piles)
                hours+=(pile+speed-1)/speed;
            if(hours<=h)
            {
                ans=speed;
                right=speed-1;
            }
            else
                left=speed+1;
        } 
    return ans;
    }
    
}