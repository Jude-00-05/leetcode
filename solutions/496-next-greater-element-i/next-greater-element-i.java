class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums2[nums2.length-1],-1);
        for(int i=0;i<nums2.length;i++){
            int right=i+1;
            while(right<nums2.length && nums2[right]<=nums2[i] ) right++;
            if(right>=nums2.length) {
                map.put(nums2[i],-1);    
            }
            else
                map.put(nums2[i],nums2[right]);

        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
        
    }

}