class Solution {
    public int minDeletion(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && (i-res)%2==0){
                res++;
            }
        }
        return res+(nums.length-res)%2;
    }
}