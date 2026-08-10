class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        int index=0;
        char [] arr=s.toCharArray();
        backtrack(arr,index,ans,"");
        return ans;
    }
     void backtrack(char[] arr,int index,List<String> ans,String curr){
        if(index==arr.length){
            ans.add(curr); 
            return; 
        }
        if(!Character.isLetter(arr[index])){
            curr+=arr[index];
            backtrack(arr, index+1,ans,curr);
            return;
        }
        
        backtrack(arr, index + 1, ans,curr + Character.toUpperCase(arr[index]));

        backtrack(arr, index + 1, ans,curr + Character.toLowerCase(arr[index]));
     }
}