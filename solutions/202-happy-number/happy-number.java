class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=sumSquare(n);
        while(slow!=fast){
            if(slow==1 || fast==1) return true;
            slow=sumSquare(slow);
            fast=sumSquare(sumSquare(fast));
        }
        return slow==1;
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