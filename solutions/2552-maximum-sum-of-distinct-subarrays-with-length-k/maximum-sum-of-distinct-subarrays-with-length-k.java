class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long maxSum = 0;
        long currSum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum += nums[right];
            
            if (right - left + 1 == k) {
                maxSum = Math.max(currSum, maxSum);
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;

            }
            right++;

        }
        return maxSum;
    }
}