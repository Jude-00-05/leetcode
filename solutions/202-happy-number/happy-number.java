class Solution {
    public boolean isHappy(int n) {
        
        if(n<=0)
            return false;
        int slow=n;
        int fast=sumSquare(n);
        while(true){
            if(slow==1 || fast==1) return true;
            if(slow==fast) return false;
            slow=sumSquare(slow);
            fast=sumSquare(sumSquare(fast));
        }
    }
    public static int sumSquare(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}