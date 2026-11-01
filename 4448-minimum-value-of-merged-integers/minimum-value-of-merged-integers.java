class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i += 2) {
            int digits = (int)Math.pow(10, String.valueOf(nums[i + 1]).length());
            int val = nums[i] * digits + nums[i + 1];
            min = Math.min(min, val);
        }
        return min;
    }
}