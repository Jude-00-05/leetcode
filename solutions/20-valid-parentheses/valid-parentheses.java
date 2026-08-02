class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='{'||c=='('||c=='['){
                stack.push(c);
                continue;
            }                 
            if(stack.isEmpty()) return false;
            if(stack.peek()=='{' && c=='}')stack.pop();
            else if(stack.peek()=='(' && c==')')stack.pop();
            else if(stack.peek()=='[' && c==']')stack.pop();
            else return false;
            
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}