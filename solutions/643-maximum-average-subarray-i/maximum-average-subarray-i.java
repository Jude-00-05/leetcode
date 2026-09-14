class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maximumSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum += nums[i];
            windowSum -= nums[i - k];

            maximumSum = Math.max(maximumSum, windowSum);
        }

        return (double) maximumSum / k;
    }
}