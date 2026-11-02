class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            cnt += nums[i] - min;
        }
        return cnt;
    }
}
