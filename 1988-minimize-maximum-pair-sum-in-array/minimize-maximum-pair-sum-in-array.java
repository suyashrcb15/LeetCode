class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length/2;i++){
            int j=nums.length-1-i;
            int sum=nums[i]+nums[j];
            max=Math.max(max,sum);
        }
        return max;
    }
}