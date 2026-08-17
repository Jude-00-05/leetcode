class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            if(arr.get(left)!=arr.get(right)){
                return false;
            }
            left++;
            right--;
        }        
        return true;
    }
}