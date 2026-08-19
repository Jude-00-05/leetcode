class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;

        HashSet<Integer> set = new HashSet<>();

        int right = nums.length - 1;

        while (right > -1) {

            HashSet<Integer> old = new HashSet<>(set);

            set.add(nums[right]);

            for (int i : old) {
                set.add(nums[right] + i);
            }

            if (set.contains(target))
                return true;

            right--;
        }

        return false;
    }
}