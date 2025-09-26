class Solution {
    public int triangleNumber(int[] nums) {
        int cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]> nums[k] && nums[j]+nums[k]>nums[i] && nums[i]+nums[k]>nums[j]){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}