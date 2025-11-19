class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int c=nums[0];
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            a=nums[nums.length-1];
            b=nums[nums.length-2];
        }
        int d=a+b-c;
        return d;
    }
}