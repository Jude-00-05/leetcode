class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Arrays.fill(ans, -1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            int curr=nums2[i];
            while(!stack.isEmpty() && curr>stack.peek()){
                int val=stack.pop();
                int idx = map.get(val);
                ans[idx]=curr;
            }
            if(map.containsKey(curr))
                stack.push(curr);
        }
        return ans;        
    }

}