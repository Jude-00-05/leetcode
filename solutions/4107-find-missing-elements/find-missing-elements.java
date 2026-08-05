class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        HashSet<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            set.add(i);
            if(i>max)max=i;
            if(i<min) min=i;
        }
        
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}