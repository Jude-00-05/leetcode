class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int length=1;
                int curr=num;
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                    
                }
                longest=Math.max(longest,length);
                
            }
        }
        return longest;
    }
}