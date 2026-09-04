class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        if(n<=0)
            return false;
        while(n>0){
            if(n==1)
                return true;
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
                n=sumSquare(n);
            }
        }
        return false;

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