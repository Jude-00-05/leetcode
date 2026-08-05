class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        backtrack(arr,0,k,sub,ans);
        return ans;

        
    }
    private void backtrack(int[] arr,int index,int k,List<Integer> sub,List<List<Integer>> ans){
        if(sub.size()==k){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i = index; i <= arr.length - (k - sub.size()); i++){
            sub.add(arr[i]);
            backtrack(arr,i+1,k,sub,ans);
            sub.remove(sub.size()-1);
        }
    }
}