class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            String ab = String.valueOf(a) + b;
            String ba = String.valueOf(b) + a;
            return ba.compareTo(ab);
        });
        if (arr[0] == 0) {
            return "0";
        }
        String s = "";
        for (int i : arr) {
            s += i;
        }
        return s;
    }
}