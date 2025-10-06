class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum=sum+nums[i];
            }
            else{
                sum1=sum1+nums[i];
            }
        }
        int res=sum-sum1;
        return res;
    }
}