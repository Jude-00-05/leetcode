class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        List<Integer> sub=new ArrayList<>();
        int index=0;
        func(nums,list,sub,index);
        return list;

    }
    static void func(int[] nums,List<List<Integer>> list,List<Integer> sub,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(sub));;
            return;
        }
        sub.add(nums[index]);
        func(nums,list,sub,index+1);
        sub.remove(sub.size()-1);
        func(nums,list,sub,index+1);
    }
}